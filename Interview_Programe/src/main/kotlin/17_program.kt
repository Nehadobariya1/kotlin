package org.example

//17. Write a program to read the value of X and Y and print the result of following expression (X+Y)*(X-Y)

fun main() {

    print("Enter value of X: ")
    var X = readLine()!!.toDouble()
    print("Enter value of Y: ")
    var Y = readLine()!!.toDouble()

    print("The result of (X+Y)*(X-Y) = ${(X+Y)*(X-Y)}")

}