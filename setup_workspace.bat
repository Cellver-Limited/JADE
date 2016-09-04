@echo off
title Preparing workspace...
gradlew setupDecompWorkspace
gradlew eclipse
pause