package com.example.kotlinessentials

fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    println(a[2])
    a[2] = 60
    println(a.get(2))

    val list = mutableListOf(1, 2, 4, 5, 6)
    list.set(2, 24)
    println(list[2])
}