#set($h1 = '#')
#set($h2 = '##')
#set($h3 = '###')
$h1 Database

$h2 Introduction

This project is used to prepare the database schema to be used by the service.

$h2 Pre-Requisites

- JRE / JDK v8
- Maven v3

$h2 How to run

$h3 Environment variables

Required environment variables:

- DATABASE_DB_USER
- DATABASE_DB_PASSWORD
- DATABASE_DB_CONNECTION_STRING
- BASE_SERVICE_DB_PASSWORD

$h3 Running migrations

- Execute `mvn clean process-resources`
