package org.example

//Write a program to read the value of X and Y and print the result of following expression //3X2+2XY+3Y2

fun main() {

    print("Enter value of X: ")
    var X = readLine()!!.toDouble()
    print("Enter value of Y: ")
    var Y = readLine()!!.toDouble()

    print("The result of 3X2+2XY+3Y2 = ${3*X*X + 2*X*Y + 3*Y*Y}")
}