package org.example

//25. Write a program to find minimum and maximum no from 2 numbers.

fun main() {

    println("Find minimum and maximum no from 2 numbers ")
    println()
    print("Enter Number One: ")
    var num1 = readLine()!!.toDouble()
    print("Enter Number Two: ")
    var num2 = readLine()!!.toDouble()

    if(num1 > num2) {
        println("$num1 is maximum number")
        println("$num2 is minimum number")
    }
    else if(num1 < num2) {
        println("$num1 is minimum number")
        println("$num2 is maximum number")
    }
    else
        print("Invalid input")

}