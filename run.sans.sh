#!/bin/bash

mvn clean package -DskipTests -f pom.sans.xml
java -jar target/hello-obfuscator.jar