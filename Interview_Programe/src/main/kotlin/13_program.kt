package org.example

//13. Write a program to swap two values

fun main() {

    println("Before Swapping value")
    var a = 10
    var b = 20

    print( "a = $a & b = $b ")
    println()
    println("After Swapping value")
    var temp = a
    a=b
    b=temp

    print( "a = $a & b = $b ")
}