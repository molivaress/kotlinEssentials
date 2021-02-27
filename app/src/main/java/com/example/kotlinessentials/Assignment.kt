package com.example.kotlinessentials

fun main() {

    val name = "asignacion simple"

    var a = 12
    var b = 6
    var ant: Int = a
    a += b
    println("$ant += $b = $a")

    ant = a
    a -= b
    println("$ant -= $b = $a")

    ant = a
    a *= b
    println("$ant *= $b = $a")
    ant = a
    a /= b
    println("$ant /= $b = $a")
    ant = a
    a %= b
    println("$ant %= $b = $a")

}