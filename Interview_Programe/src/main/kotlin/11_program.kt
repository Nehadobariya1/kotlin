package org.example

//11. Write a program to calculate area and perimeter of the rectangle

fun main() {

    println(" calculate area and perimeter of the rectangle ")
    println()
    print("enter length of the rectangle: ")
    var length = readLine()!!.toFloat()
    print("enter width of the rectangle: ")
    var width = readLine()!!.toFloat()

    println("Area of the rectangle = ${length * width} ")
    println("perimeter of the rectangle = ${2*(length*width)} ")

}