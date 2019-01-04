#!/usr/bin/env bash

cd liquibase
sh ./migrate.sh
cd ../data-upload
./load-data.sh
