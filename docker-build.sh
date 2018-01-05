#!/bin/bash

cd cassandra_node && docker build -t cassandra-node . && cd ../
cd product_service && ./mvnw -Dmaven.test.skip=true install dockerfile:build && cd ../