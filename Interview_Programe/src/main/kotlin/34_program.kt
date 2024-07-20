package org.example

//34. Write a program input one integer number display appropriate day of week.

fun main() {
    println("Enter number between 1 to 7 for display appropriate day of week: ")
    var no = readLine()!!.toInt()

   when(no)
   {
       1 -> println("Sunday")
       2 -> println("Monday")
       3 -> println("Tuesday")
       4 -> println("Wednesday")
       5 -> println("Thursday")
       6 -> println("Friday")
       7 -> println("Saturday")
       else -> println("Invalid input")
   }

}