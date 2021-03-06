package com.example.kotlinessentials.controlflow

fun main() {

    if (1 == 2) {
        println("if condition")
        if (3 != 2) {
            println("inner if condition")
        }
    } else if (2 == 2) {
        println("else if")
    } else {
        println("else")
    }


    val a = 10
    var b = 2
    val max: Int? = if (a > b) {
        //.... other code
        println("value: ${a * a}")
        if (a == 10) a else 40
    } else {
        null
    }
    println("max = $max")


    val value = if (a > b) {
        30
    } else if (b > a) {
        50
    } else {
        100
    }

}