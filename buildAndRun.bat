@echo off
call mvn clean package
call docker build -t ec.com.gjijon.examples.kub/fintes .
call docker rm -f fintes
call docker run -d -p 9080:9080 -p 9443:9443 --name fintes ec.com.gjijon.examples.kub/fintes