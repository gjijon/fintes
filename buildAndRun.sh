#!/bin/sh
if [ $(docker ps -a -f name=fintes | grep -w fintes | wc -l) -eq 1 ]; then
  docker rm -f fintes
fi
mvn clean package && docker build -t gjijon/fintes .
docker run -d -p 9080:9080 -p 9443:9443 --name fintes gjijon/fintes
