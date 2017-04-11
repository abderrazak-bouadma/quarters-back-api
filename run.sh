#!/usr/bin/env bash

# pull the latest code from master
checkout() {
    git checkout master
    git pull
}

# builds the master branch
build() {
    mvn clean install
}

# starts the app
start() {
    java -Dspring.profiles.active=dev,swagger \
        -jar target/*.jar
}

# ----

checkout
build
start