#!/bin/bash

if ! nc -z localhost 9042; then
    echo "Waiting for Cassandra to start..."
    while ! nc -z localhost 9042; do
       sleep 3
    done
    echo "Cassandra is ready."

    if ${INIT_DB} == true; then
    echo "Initialize a database."
    cqlsh -f /schema.cql
    fi
fi &

exec /docker-entrypoint.sh "$@"
