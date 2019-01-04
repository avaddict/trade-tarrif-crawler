#!/usr/bin/env sh

liquibase --driver="com.microsoft.sqlserver.jdbc.SQLServerDriver" \
    --url="${DATABASE_DB_CONNECTION_STRING}" \
    --changeLogFile="migrations.xml" \
    --username="${DATABASE_DB_USER}" \
    --password="${DATABASE_DB_PASSWORD}" \
    migrate \
    -DserviceDbPassword="${BASE_SERVICE_DB_PASSWORD}"
