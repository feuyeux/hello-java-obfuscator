#!/bin/bash
mvn clean package -DskipTests -f pom.avec.xml
java -jar target/hello-obfuscator-obfuscated.jar