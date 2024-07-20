package org.example

//8. The distance between two cities is input through keyboard. Write a program to convert and print
//this distance in feet, meter, inch and centimeter


fun main() {
    println("convert Distance between two cities in feet, meter,inch and centimeter ")
    println()
    print("Enter Distance between two cities in Kilometers: ")
    var kilometers = readLine()!!.toFloat()

    var meters = kilometers * 1000
    var centimeter = meters * 100
    var feet = meters * 3.28084
    var inch = meters * 39.3701

    println("Distance between two cities in :")
    println("Meter = $meters")
    println("centimeter = $centimeter")
    println("Feet = $feet")
    println("Inch = $inch")

}
