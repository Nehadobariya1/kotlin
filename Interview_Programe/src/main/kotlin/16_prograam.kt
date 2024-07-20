package org.example

//16. Write a program to read the value of X and Y and print the result of following  expression (X+Y)/2
fun main() {

    print("Enter value of X: ")
    var X = readLine()!!.toDouble()
    print("Enter value of Y: ")
    var Y = readLine()!!.toDouble()

    print("The result of (X+Y)/2 = ${(X+Y)/2}")

}