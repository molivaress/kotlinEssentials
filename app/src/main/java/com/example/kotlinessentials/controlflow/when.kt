package com.example.kotlinessentials.controlflow

fun main() {

    val a = 20
    val b = 100
    val c = 10

    println("Enter operator either +, -, * or /")
    val operator = "+"//readLine()

    var result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result ")


    var n = 5
    result = when (n) {
        2, 3, 4, 5 -> "2,3,4,5"
        else -> "nothing"
    }
    println("result = $result ")

    result = when {
        (a < b && a > c) -> "(a < b && a < c)"
        a > b -> " a > b"
        else -> "nothing"
    }
    println("result = $result ")

    val number = 11
    result = when (number) {
        in 1..10 -> "1 hasta 10"
        in 10..100 -> "10 hasta 100"
        else -> "fuera de rango"
    }

    when (number) {
        in 1..10 -> println("1 hasta 10")
        in 10..100 -> println("10 hasta 100")
        else -> println("fuera de rango")
    }
    println("result = $result ")

    //var x: Any = intArrayOf(1, 2, 3, 5)
    var x: Any = "CAT"
    when (x) {
        is Int -> println("Int = ${x.plus(x)}")
        is String -> {
            println("String = ${x.plus(x)}")
            when (x.toLowerCase()) {
                "cat".toUpperCase() -> println("valor x when String type: $x")
            }
        }
        is Float -> println("Float = ${x.plus(x)}")
        is IntArray -> println("IntArray = ${x.sum()}")
    }

    val value = when {
        a > b -> {
            30
        }
        b > a -> {
            50
        }
        else -> {
            100
        }
    }

    println("value : $value")
}