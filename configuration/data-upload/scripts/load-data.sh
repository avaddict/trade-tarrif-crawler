#!/usr/bin/env bash

cd data

load_data() {
    DATA_TABLE=$1

    echo "[INFO] Clearing ${DATA_TABLE} table"
    /opt/mssql-tools/bin/sqlcmd -d ${DATABASE_DB_NAME} -U ${BASE_SERVICE_DB_USER} -P ${BASE_SERVICE_DB_PASSWORD} -S "tcp:${DATABASE_DB_HOST},${DATABASE_DB_PORT}" -Q "TRUNCATE TABLE dbo.${DATA_TABLE}" -C -l 30

    if [ $? != 0 ]; then
        echo "[ERROR] Data migration failed while loading ${DATA_TABLE}"
        exit 1
    fi

    echo "[INFO] Importing ${DATA_TABLE} data via bcp"
    /opt/mssql-tools/bin/bcp ${DATA_TABLE} in "./${DATA_TABLE}.tab" -S ${DATABASE_DB_HOST} -U "${BASE_SERVICE_DB_USER}@${DATABASE_DB_HOST}" -P ${BASE_SERVICE_DB_PASSWORD} -d ${DATABASE_DB_NAME} -F1 -f "./${DATA_TABLE}.fmt" -b 100

    if [ $? != 0 ]; then
      echo "[ERROR] Data migration failed while loading ${DATA_TABLE}"
      exit 1
    fi
}

load_data test_data
