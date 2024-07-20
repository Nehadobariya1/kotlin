package org.example

//32. Write a program input one integer number check whether number is four digits or not

fun main() {
    println("check whethers number is four digits or not ")
    println()
    print("Enter the number :")
    var no = readLine()!!.toInt()
    if(no>999 && no < 9999)
    {
        println("$no  number is four digits")
    }
    else
    {
        println("$no  number is not a four digits")
    }
}