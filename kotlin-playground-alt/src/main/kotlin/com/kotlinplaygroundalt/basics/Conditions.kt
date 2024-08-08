package org.example.com.kotlinplaygroundalt.basics

fun main() {
    var name = "Alex"
    name = "Chloe"

    if (name.length <= 4) {
        println("Name is too short")
    } else {
        println("Name is fine")
    }

    // written as an expression
    val result = if (name.length <= 4) {
        println("Name is too short")
        // return type: the last statement in a block of code
        name.length
    } else {
        println("Name is fine")
        name.length
    }

    println("result name character length: $result")
    // if there is no return statement then it would return as undefined
    // result name character length: kotlin.Unit

    // val position = 4
    val position = (0..4).random()

    // v1
    val medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "Loser!"
    }

    println(medal)

    // v2: linter refactor from 'if' to 'when' (introduced in Kotlin)
    // akin to a switch case
    val medalAlt = when (position) {
        1 -> {
            "Yes, GOLD!"
        }
        2 -> {
            "Yes, SILVER!"
        }
        3 -> {
            "Yes, BRONZE!"
        }
        else -> {
            "I'm a loser baby, so why don't you kill me... (drive by body-pierce)"
        }
    }

    println(medalAlt)

}
