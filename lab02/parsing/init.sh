#!/bin/bash
cd "${0%/*}"

javac -cp "./bin:./lib/antlr-4.9-complete.jar" src/App.java
java -Dfile.encoding=UTF-8 -cp "./bin:./lib/antlr-4.9-complete.jar" App