package com.example.kotlinessentials.controlflow

fun main() {

    println("simple")
    for (i in 1..5) {
        print("$i,")
    }
    println()

    println("reverse")
    for (i in 10 downTo 0) {
        print("$i,")
    }
    println()

    println("simple step 2")
    for (i in 1..5 step 2) {
        print("$i,")
    }
    println()

    println("reverse step 2")
    for (i in 10 downTo 0 step 2) {
        print("$i,")
    }
    println()

    println("bucles en array")
    for (i in arrayOf(1, 2, 3, 4, 5, 67, 88)) print("$i,")
    println()

    val array = arrayOf(1, 2, 3, 4, 5, 67, 88)
    for (i in array.indices) {
        print("indice $i, value ${array[i]} ")
    }

    println()
    val string = "Hello World"
    for (i in string) {
        when (i) {
            'l' -> print("${i.toUpperCase()},")
            else -> print("$i,")
        }

    }
    println()

    val collection: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    for (i in collection) print("$i,")
    println()
}