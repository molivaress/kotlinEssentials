package com.example.kotlinessentials

fun main() {
    // tipos de datos numericos
    val byte: Byte = 126
    val short: Short = 343
    val entero: Int = 327697349
    val long = 537534L
    val float: Float = 5334534f
    val double: Double = 543875.0
    var number: Number = 123.0

    println("number is Double ${number is Int}")
    number = 123
    println("number is Int ${number is Int}")
    number = 123F
    println("number is Float ${number is Float}")

    // tipos de datos cadenas (char)
    val letter: Char = 'a'
    println("letter: $letter")

    var boolano = true
    boolano = false

    var list: MutableList<Any> = mutableListOf("valor2", "valor3")
    println("lista: $list")
    list = mutableListOf("a", "b")
    println("lista: $list")
    list.add("c")
    println("lista: $list")

    val string: String = "hola"

}

data class Test(val prop1: String?)