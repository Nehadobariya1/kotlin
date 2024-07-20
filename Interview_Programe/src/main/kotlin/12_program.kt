package org.example

//12. Write a program to calculate area of circle


fun main() {
    println("calculate area of circle")
    println()
    print("Enter Radius of circle:")
    var radius = readLine()!!.toFloat()
    var pie : Float = 3.14f
    println("area of circle = ${pie*radius*radius}")
}