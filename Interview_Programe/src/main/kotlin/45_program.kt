package org.example

//45. Get a string from user and display it in lower case

fun main() {
    println()
    print("Enter String for convert in lower case: ")
    var str = readLine().toString()

    println("In lower case: ${str.lowercase()}")
}