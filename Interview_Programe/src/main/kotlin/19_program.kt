package org.example

//19. Write a program to read the value of X and Y and print the result of following expression (2X+3Y)/XY

fun main() {

    print("Enter value of X: ")
    var X = readLine()!!.toDouble()
    print("Enter value of Y: ")
    var Y = readLine()!!.toDouble()

    print("The result of (2X+3Y)/XY = ${(2*X+3*Y)/X*Y}")
}