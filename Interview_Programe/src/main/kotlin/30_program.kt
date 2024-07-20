package org.example
//30. Write a program input one integer number. Check whether number is equal to 10 or not.
fun main() {
    print("Enter number to check number is equal to 10 or not: ")
    var num = readLine()!!.toInt()
    if(num == 10)
    {
        println("Number is equal to 10")
    }
    else
    {
        println("Number is equal not to 10")
    }
}