package org.example.com.kotlinplaygroundalt.basics
// Once I make modifications, initially unable to Re-run via Run console:
// "Error running 'LabelsAndReturnKt'
// Class 'org.example.com.kotlinplaygroundalt.basics.LabelsAndReturnKt' not found in module 'kotlin-playground-alt.main'"
// ... but EVENTUALLY IT WORKS.
// it's like IntelliJ takes a while to process it all...
// for instance, initially the fun label() wasn't recognized. It took a minute or so to do so.
// Looking online, may be an issue with Gradle plug-in
// https://youtrack.jetbrains.com/issue/IJPL-11463/All-RunConfiguration-Dropdowns-show-Nothing-here
// https://youtrack.jetbrains.com/issue/IDEA-228180/Run-Debug-menus-show-nothing-here-when-Grade-plugin-is-enabled

fun main() {
    for (i in 1..5) {
        println("i in $i")
        if (i==3) break
    }

    label()

    println("Break condition met. End of the program.")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")
        // if (i==3) break@loop

        innerloop@ for (j in 1..5) {
            println("j in label $j")
            // v1
            // if (j==2) break@innerloop
            // v2
            if (j==2) continue@loop
        }
//        for (j in 1..5) {
//            println("j in label $j")
//            if (j==2) break
//        }
    }
}