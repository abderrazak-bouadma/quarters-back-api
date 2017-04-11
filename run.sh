#!/usr/bin/env bash

build() {
    mvn clean install
}

start() {
    java -Dspring.profiles.active=dev,swagger \
        -jar target/*.jar
}

# ----

build
start