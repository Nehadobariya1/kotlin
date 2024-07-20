package org.example

//41. Write a program to find number which number is divisible by 3 but not divisible by 7

fun main() {
    println()
    print("Enter number for check that divisible by 3 but not divisible by 7 :")
    var no = readLine()!!.toInt()
    if(no % 3==0 && no % 7 != 0)
    {
        println("Number is divisible by 3 but not divisible by 7")
    }
    else
    {
        println("Number not divisible by 3")
    }
}