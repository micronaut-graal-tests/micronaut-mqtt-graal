#!/bin/bash

./gradlew nativeCompile
cp build/native/nativeCompile/mqtt-v5 .
