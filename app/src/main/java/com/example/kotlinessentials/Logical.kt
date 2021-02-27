package com.example.kotlinessentials

fun main() {

    val a = 19
    val b = 9
    val c = -1
    var result: Boolean

    result = (a > b) && (a > c)
    println("result: $result")

    result = (a > b) and (a > c)
    println("result: $result")

    result = (a > b) || (a > c)
    println("result: $result")

    result = (a > b) or (a > c)
    println("result: $result")

    result = (a > b) xor (a > c)
    println("result: $result")

    result = true xor false
    println("result: $result")

    result = true xor true
    println("result: $result")


}