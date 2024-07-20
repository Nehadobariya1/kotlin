package org.example

//26. Write a program to check number is odd or even

fun main() {
    println("program to check number is odd or even ")
    println()
    print("Enter Number to check whether it is odd or even: ")
    var no = readLine()!!.toInt()
    if(no % 2 == 0)
    {
        println("$no is an even number")
    }
    else
        print("$no is an odd number")
}