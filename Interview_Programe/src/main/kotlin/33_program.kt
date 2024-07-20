package org.example

//33. Write a program input one integer number check whether is greater than 50 and less then 200

fun main() {
    println("check whether is greater than 50 and less then 200")
    println()
    print("Enter the number :")
    var no = readLine()!!.toInt()
    if(no>50 && no < 200)
    {
        println("$no number is greater than 50 and less then 200")
    }
    else
    {
        println("$no is not  greater than 50 and less then 200")
    }
}