package org.example

//3. Write a program that accept two numbers and perform all basic mathematical operation and print.

fun main() {

    println("Basic Mathematical Operation")
    println("---------------------------")
    print("Enter Number 1: ")
    val num1 = readLine()!!.toInt()
    print("Enter Number 2: ")
    val num2 =  readLine()!!.toInt()
    println("---------------------------")

    println("Addition : ${num1 + num2}")
    println("Subtraction : ${num1 - num2}")
    println("Multiplication : ${num1 * num2}")
    println("Division : ${num1 / num2}")
    println("Modulus : ${num1 % num2}")
}