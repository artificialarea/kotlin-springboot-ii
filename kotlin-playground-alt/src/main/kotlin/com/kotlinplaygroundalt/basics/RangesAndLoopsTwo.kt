// ISSUE: Sometimes Can't run build via (either) package
// 1. Play button: "Nothing here"
// 2. else Re-run via Run console: "Error..." else Build Output "Conflicting overloads..."
// 3. else Build Output "Conflicting overloads..." (because I had the same "exploreWhile()" fun in two files, since renamed)
package org.example.com.kotlinplaygroundalt.basics

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

    exploreWhileTwo()

}

fun exploreWhileTwo() {
    var x = 1
    while (x < 5) {
        println("x: $x")
        x++
    }
}