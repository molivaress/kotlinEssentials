package com.example.kotlinessentials.controlflow

fun main() {

    var sum = 0
    var number: Int

    // while siempre ejecuta el ciclo si es la condicion es verdadera si es falsa sale
    while (true) {
        println("Enter a number: ")
        number = 0//readLine()!!.toInt()

        if (number == 0)
            break

        sum += number
    }

    println("sum = $sum")


    // un programa que solo me sume los valores pares ingresados
    sum = 0
    while (true) {
        println("Sumando pares: ")
        number = readLine()!!.toInt()

        if (number == 0)
            break

        if (number % 2 != 0) {
            continue
            // hacia abajo ya no se ejecuta
        }
        sum += number
        // more code
    }

    println("sum pares = $sum")





    // un programa que solo me sume los valores pares ingresados
    sum = 0
    do {
        println("Sumando pares: ")
        number = readLine()!!.toInt()

        if (number == 0)
            break

        if (number % 2 != 0) {
            continue
            // hacia abajo ya no se ejecuta
        }
        sum += number
        // more code
    } while (true)

    println("sum pares = $sum")
}