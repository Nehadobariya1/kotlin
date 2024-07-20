package org.example

//22. Write a program to find out the net salary of an employee and get the basic salary from him.
//Applicable TA 4%, DA 30%, HRA 15% on basic salary. Applicable 3% tax 12% PF on basic salary


fun main() {
    println("Find Net Salary")
    println()
    print("Enter the Salary: ")
    var salary = readLine()!!.toInt()
    var ta = (salary * 4)/100
    var da = (salary * 30)/100
    var hra = (salary * 15)/100
    var tax = (salary * 3)/100
    var pf = (salary * 12)/100

    println("Net Salary  = ${salary + ta + da + hra - tax - pf}")
}