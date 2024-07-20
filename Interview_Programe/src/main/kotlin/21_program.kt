package org.example

//21. Write a program that accept 5 numbers from user and find average of the value

fun main() {
    println("Average of the Five value")
    println()
    print("Enter First Number : ")
    val first = readLine()!!.toInt()
    print("Enter Second Number : ")
    val second = readLine()!!.toInt()
    print("Enter Third Number : ")
    val third = readLine()!!.toInt()
    print("Enter Fourth Number : ")
    val fourth = readLine()!!.toInt()
    print("Enter Fifth Number : ")
    val fifth = readLine()!!.toInt()
    println()

    println("Average of Total Value is : ${(first+second+third+fourth+fifth)/5}")
}