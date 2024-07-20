package org.example

//7. Write a program to convert KM into Meter

fun main() {
    println("Convert KM into Meter")
    print("Enter KiloMeter: ")
    val kiloMeter = readLine()!!.toInt()

    println("$kiloMeter KiloMeter = ${kiloMeter*1000} Meter")
}