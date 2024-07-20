package org.example

//27. Write a program that accepts the year from user and check it leap year or not.

fun main() {
    println("program that accepts the year from user and check it leap year or not")
    println()
    print("Enter year to check it leap year or not: ")
    var year = readLine()!!.toInt()
    if(true){
        if(year == 0 )
        {
            print("Invalid year")
        }
    }
    else{

        if(year % 4 ==0 && year % 100 != 0)
        {
            println("year is Leap year")
        }
        else
        {
            println("year is Not Leap year")
        }
    }

}