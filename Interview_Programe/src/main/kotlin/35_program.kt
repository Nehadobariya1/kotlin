package org.example

//35. Write a program input one integer number display appropriate name of month

fun main() {
    println(" number display appropriate name of month ")
    println()
    print("Enter number between 1 to 12 for display appropriate day of week: ")
    var no = readLine()!!.toInt()

    when(no)
    {
        1-> println("January")
        2-> println("February")
        3-> println("March")
        4-> println("April")
        5-> println("May")
        6-> println("June")
        7-> println("July")
        8-> println("August")
        9-> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")
        else-> println("Invalid Number")
    }

}