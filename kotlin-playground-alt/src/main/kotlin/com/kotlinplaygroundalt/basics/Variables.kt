package org.example.com.kotlinplaygroundalt.basics

fun main(args: Array<String>) {

    /*
    * Type inference.
    * Kotlin will infer variable (Gradle) types without defining it explicitly. If you do define the type, the linter will inform you “Explicitly given type is redundant here” and allow you to remove it.
    */
    val name : String = "Dilip"
    println(name)

    // note the linter warning (which will result in a error during runtime)
    // and the linter suggestion to change variable from  `val` to `var`
//    name = "Tony"
//    println(name)

    var age : Int = 18
    println(age)
    age = 35
    println(age)

//    val salary = 30000L
    val salary : Long = 30000
    println(salary)


    /*
    * String Interpolation aka String Template
    */

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiLineStandard = "ABC \n DEF"
    println(multiLineStandard)

    val multiLineKotlinTripleQuotes = """
        ABC
        DEF
    """.trimIndent()
    println(multiLineKotlinTripleQuotes)
}