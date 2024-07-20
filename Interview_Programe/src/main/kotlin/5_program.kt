package org.example

fun main() {
    print("Enter Principal Amount")
    var principalAmount = readLine()!!.toFloat()
    print("Enter Interest Rate")
    var interestRate = readLine()!!.toFloat()
    var rate= interestRate / 100
    print("Enter compounded Months")
    var noOfMonths = readLine()!!.toFloat()
    print("Enter No Of Year")
    var noOfYears = readLine()!!.toFloat()

    var formula=principalAmount * (1 + rate/noOfMonths)

}