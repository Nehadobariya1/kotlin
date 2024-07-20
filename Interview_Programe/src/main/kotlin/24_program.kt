package org.example

//24. Write a program to find out minimum number from 2 numbers

fun main() {
    println("Find minimum number from 2 numbers  ")
    println()
    print("Enter Number One: ")
    var num1 = readLine()!!.toDouble()
    print("Enter Number Two: ")
    var num2 = readLine()!!.toDouble()

    if(num1 < num2)
        print("$num1 is minimum number")
    else
        print("$num2 is minimum number")
}