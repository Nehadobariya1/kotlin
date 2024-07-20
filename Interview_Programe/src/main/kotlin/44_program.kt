package org.example

//44. Get a string from user and display it in upper case

fun main() {
    println()
    print("Enter String for convert in Upper case: ")
    var str = readLine().toString()

    println("In UPPER CASE: ${str.uppercase()}")
}