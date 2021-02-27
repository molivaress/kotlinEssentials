package com.example.kotlinessentials

fun main() {
    val a = -4
    val b = 4

    val max = if (a > b) {
        //....
        a
    } else {
        b
    }
    println("max = $max")

    val min = if (a == b) {
        //....
        a
    } else {
        b
    }
    println("min = $min")

    val result1 = b.compareTo(a) > 0
    println("result1: $result1 ")

    val result2 = b.compareTo(a) < 0
    println("result2: $result2 ")


    val result3 = b.compareTo(a) <= 0
    println("result3: $result3 ")

    val result4 = b.compareTo(a) >= 0
    println("result4: $result4 ")

    val result5 = a?.equals(b) ?: (b === null)
    println("result5: $result5")

}