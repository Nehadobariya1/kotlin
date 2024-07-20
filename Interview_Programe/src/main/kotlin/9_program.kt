package org.example

//9. Write a program to 9. Write a program to find volume of cylinder (v = 3.14r2h )(v = 3.14r2h )

fun main() {
    println("find volume of cylinder")
    println()
    print("Enter Radius of cylinder : ")
    var radius = readLine()!!.toFloat()
    print("Enter height of cylinder : ")
    var height = readLine()!!.toFloat()

    println("Volume of cylinder of $radius radius and height of $height is ${3.14*radius*2*height}")
}