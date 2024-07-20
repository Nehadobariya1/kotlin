package org.example

//4. Write a program to calculate simple interest.

fun main() {

    print("Enter Principal Amount:")
    var PrincipalAmount = readLine()!!.toInt()
    print("Enter Interest Rate:")
    var Rate =  readLine()!!.toInt()
    print("Enter Period value:")
    var PeriodValue = readLine()!!.toInt()

    println("Simple Interest = ${(PrincipalAmount * Rate * PeriodValue)/100}")


}