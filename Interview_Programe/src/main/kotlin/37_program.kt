package org.example

//37. Write a program to find out minimum from three number

fun main() {
    println("find out minimum from three number ")
    println()
    print("Enter Number One:")
    var no1 = readLine()!!.toInt()
    print("Enter Number Two:")
    var no2 = readLine()!!.toInt()
    print("Enter Number Three:")
    var no3 = readLine()!!.toInt()

    if(no1<no2 && no1 < no3)
    {
        println("$no1 is minimum number")

    }
    else if(no2<no1 && no2<no3)
    {
        println("$no2 is minimum number")
    }
    else if(no3<no1 && no3<no2)
    {
        println("$no3 is minimum number")
    }
    else
    {
        print("Invalid Number")
    }
}