package com.example.kotlinessentials

fun main() {
    val a = 1
    val b = true
    var c = 1

    var result: Int
    var booleanResult: Boolean

    result = +a
    println("+a: $result")

    result = -a
    println("-a: $result")

    booleanResult = !b
    println("!b : $booleanResult")

    --c
    println("--c : $c")
    ++c
    println("++c : $c")

    result = a.unaryPlus()
    println("result: $result")

    result = a.unaryMinus()
    println("result: $result")

    booleanResult = b.not()
    println("booleanResult: $booleanResult")

    c = c.dec()
    println("c.dec(): $c")
    c = c.inc()
    println("c.inc() : $c")
    
}