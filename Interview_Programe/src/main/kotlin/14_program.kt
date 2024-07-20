package org.example

//14. Write a program to swap two values without using third variable

fun main() {

    println("swap two values without using third variable")
    println("Before Swapping value")
    println()
    print("Enter value One :")
    var a = readLine()!!.toInt()
    print("Enter value Two :")
    var b = readLine()!!.toInt()

    print( "a = $a & b = $b ")
    println()
    println("After Swapping value")
    a=a+b  //70
    b=a-b  //50
    a=a-b  //20

    print( "a = $a & b = $b ")
}