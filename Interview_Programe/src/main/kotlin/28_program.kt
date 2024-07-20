package org.example

//28. Write a program to that accept the number from user and check it is divisible by 5 or  not.

fun main() {
    println("check the number is divisible by 5 or  not. ")
    println()
    print("Enter the number:")
    var num = readLine()!!.toInt()

    if(num % 5 == 0)
    {
        println("$num is Divisible by 5")
    }
    else
    {
        println("$num is Not Divisible by 5")
    }
}
