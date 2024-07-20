package org.example

//20. Write a program to convert negative to positive and positive to negative

fun main() {
    println("convert negative to positive and positive to negative")
    println()
    print("Enter Positive or Negative Number: ")
    var no = readLine()!!.toInt()

    if(no > 0)
        println("Positive to negative : -$no")
    else
        println("Negative to positive : ${-no}")
}