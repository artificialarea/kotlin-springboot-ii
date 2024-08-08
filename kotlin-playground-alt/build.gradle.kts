plugins {
    kotlin("jvm") version "1.9.23"
}

 group = "org.example"
/*
 attempted to remove 'group' so THEORETICALLY when I create a Kotlin file it will generate package like so
 package com.kotlinplaygroundalt
 instead of like so
 package org.example.com.kotlinplaygroundalt

 BUT DOESN'T SEEM TO HAVE ANY EFFECT ON THE EARLY FILE INSTANCES GENERATED BEFORE THE CHANGE
 (still requires package to be prefaced with 'org.example...') ¯\_(ツ)_/¯

 Perhaps I need to rebuild this file akin to `yarn build` beyond just saving the file ?
 (not sure what the cmd would be for Gradle/Kotlin, tho)
 */

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}