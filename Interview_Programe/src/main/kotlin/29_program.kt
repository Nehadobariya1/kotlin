package org.example

//29. Write a program that accept the number from user and check its negative, positive or  zero

fun main() {
    println("accept the number from user and check its negative, positive or  zero")
    println()
    print("Enter the number you want to proceed: ")
    var num = readLine()!!.toInt()

    if(num > 0)
    {
        print("Number $num is positive ")
    }
    else if(num < 0)
    {
        print("Number $num is negative")
    }
    else if(num == 0)
    {
        print("Number $num is zero")
    }
    else
    {
        print("Invalid Input")
    }
}