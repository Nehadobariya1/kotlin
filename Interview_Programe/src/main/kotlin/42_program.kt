package org.example

//42. Write a program that reads a sales bill amount calculate discount on bill amount as follows
//if bill amount less than 5000 calculate 7.5% discount on bill amount otherwise calculate 11%
//discount on bill. Print bill amount discount amount and net payable bill

fun main() {

    println("Bill amount calculate")
    println()
    print("Enter your bill amount: ")
    var billAmount = readLine()!!.toDouble()

    if(billAmount == 0.0)
    {
        println("Enter valid amount")
    }
    else if(billAmount < 5000 ){
        println("Congratulation you got 7.5% Discount")
        println()
        println("Bill amount = $billAmount")
        println("Discount = ${(billAmount * 7.5)/100}")
        println("Net payable Bill = ${billAmount - ((billAmount * 7.5)/100)}")
    }
    else
    {
        println("Congratulation you got 11% Discount")
        println()
        println("Bill amount = $billAmount")
        println("Discount = ${(billAmount * 11)/100}")
        println("Net payable Bill = ${billAmount - ((billAmount * 11)/100)}")
    }


}