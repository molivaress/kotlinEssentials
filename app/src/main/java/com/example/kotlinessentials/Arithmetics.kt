package com.example.kotlinessentials

fun main() {
    val number = 24.0
    val number2 = 5.0
    var result: Double = 0.0

    result = number + number2
    println("result: $result")
    result = number - number2
    println("result: $result")
    result = number * number2
    println("result: $result")
    result = number / number2
    println("result: $result")
    result = number % number2
    println("result: $result")

    // concatenacion
    val start = "Inicio "
    val middle = "Intermedio "
    val end = "Final "
    val strinResult = start + middle + end
    println(strinResult)

    result = number.plus(number2)
    println("result: $result")

    result = number.minus(number2)
    println("result: $result")

    result = number.times(number2)
    println("result: $result")

    result = number.div(number2)
    println("result: $result")

    result = number.rem(number2)
    println("result: $result")
    
}