// ISSUE: Sometimes Can't run build via (either) package
// 1. Play/Run button: "Nothing here" (eventually the Run functionality may return, tho)
// 2. else Re-run via Run console: "Error running 'LabelsAndReturnKt'"
// 3. else Build Output "Conflicting overloads..." (because I had the same "exploreWhile()" fun in two files, since renamed)
package org.example.com.kotlinplaygroundalt.basics
// package com.kotlinplaygroundalt.basics


fun main() {
    /*val range = 1..10

    for (i in range) {
        println("i: $i")
    }

    val reverseRange = 10 downTo 1

    for (i in reverseRange) {
        println("reverseRange: $i")
    }
    for (i in reverseRange step 2) {
        println("reverseRange with skip/step: $i")
    }*/

    exploreWhileOne()
    exploreDoWhile()
}

fun exploreWhileOne() {
    var x = 1
    while (x < 5) {
        println("x: $x")
        x++
    }
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("i: $i")
        i++
    } while (i < 5)
}
