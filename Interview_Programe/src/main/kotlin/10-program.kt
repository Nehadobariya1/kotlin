package org.example

//10. Write a program to calculate area of triangle (a = 1/2hb)

fun main() {
    println("calculate area of triangle")
    println()
    print("Enter height of the triangle: ")
    var height = readLine()!!.toFloat()
    print("Enter Base of the triangle: ")
    var base = readLine()!!.toFloat()

    println("Area of triangle of height $height  and base $base is ${0.5*height*base}")
}