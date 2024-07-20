package org.example

//1. Write a program input one integer number check whether number is in between 0 to 100 or not

fun main() {
    println("check whether number is in between 0 to 100 or not ")
    println()
    print("Enter Number: ")
    var no = readLine()!!.toInt()
    if(no>0 && no<100)
    {
        print("$no number is in between 0 to 100")
    }
    else
    {
        print("$no number is not in between 0 to 100")
    }
}