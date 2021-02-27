package com.example.kotlinessentials

fun main() {

    val numbers = intArrayOf(1, 4, 5, 7, 9)

    if (4 in numbers) {
        println("numbers contains 4.")
    }
    if (4 !in numbers) {
        println("numbers contains 4.")
    }

    if (numbers.contains(4)) {
        println("numbers contains 4.")
    }
    if (!numbers.contains(4)) {
        println("numbers contains 4.")
    }

    val string = "Hello"
    if (string.contains("H")) {
        println("Si contiene")
    }

    if ("o" in string) {
        println("Si contiene")
    }


}