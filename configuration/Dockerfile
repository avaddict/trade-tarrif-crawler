FROM ubuntu:16.04

# Needed for running sqlcmd and bcp
RUN echo 'en_US.UTF-8 UTF-8' > /etc/locale.gen
RUN apt-get update && apt-get install -y locales openjdk-8-jre

# Copy and unpack Liquibase
ADD database/lib/liquibase-3.6.2-bin.tar.gz opt/liquibase

# Copy setup script
COPY setup.sh /opt

# Copy database migration script
COPY database/scripts/migrate.sh /opt/liquibase

# Copy database drivers
COPY database/src/main/resources/drivers /opt/liquibase/lib

# Copy changelogs
COPY database/src/main/resources/changelogs /opt/liquibase/changelogs
COPY database/src/main/resources/migrations.xml /opt/liquibase

# Copy static data
COPY data-upload/test_data /opt/data-upload/data
COPY data-upload/scripts/load-data.sh /opt/data-upload

RUN chmod +x /opt/liquibase/liquibase && ln -s /opt/liquibase/liquibase /usr/local/bin/ && chmod +x /opt/setup.sh && chmod +x /opt/liquibase/migrate.sh && chmod +x /opt/data-upload/load-data.sh

# Install bcp
RUN apt-get update && apt-get install -y curl gnupg apt-transport-https
RUN curl -fsSL https://packages.microsoft.com/keys/microsoft.asc | apt-key add -
RUN curl -o /etc/apt/sources.list.d/msprod.list https://packages.microsoft.com/config/ubuntu/16.04/prod.list
RUN apt-get update && ACCEPT_EULA=y apt-get install -y mssql-tools
WORKDIR /opt

CMD ["/bin/sh", "setup.sh"]
