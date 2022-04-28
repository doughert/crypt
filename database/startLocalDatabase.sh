#!/usr/bin/env bash

cd $(dirname "$0")

docker build -t postgres-image .

docker stop postgres-container

docker rm postgres-container

docker run --name=postgres-container -v "$PWD/my-postgres.conf":/etc/postgresql/postgresql.conf --restart=always -p 5435:5432 postgres-image -c 'config_file=/etc/postgresql/postgresql.conf'

