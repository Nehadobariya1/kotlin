package org.example

//43. An electric power distribution company charger its domestic customers as follows
//Consumption unit rate of charge
//0 – 200 RS. 0.50 per unit
//201 – 400 RS. 100 + RS. 0.65 per unit
//401 – 600 RS. 230 + RS. 0.80 per unit
//601 and above RS. 390 + RS. 1.00 per unit
//
//Read the customer number and power consumed and print the amount to be paid by
//the customer

fun main() {

    print("Enter Customer Number:")
    var username = readLine()!!.toString()

    print("Enter Consumption unit:")

    var units = readLine()!!.toDouble()
    var amountPayable = 0.0
    if(units > 0 && units <=200)
    {
        println("--------------------------------")
        println("Customer Number: $username")
        println("Consumption unit: $units")
        println("Payable Amount = ${units * 0.50}")
    }
    else if(units >201 && units < 400)
    {
        println("--------------------------------")
        println("Customer Number: $username")
        println("Consumption unit: $units")
        println("Payable Amount = ${100+(units - 200) * 0.65}")
    }
    else if(units >401 && units < 600)
    {
        println("--------------------------------")
        println("Customer Number: $username")
        println("Consumption unit: $units")
        println("Payable Amount = ${230+(units - 400) * 0.80}")
    }
    else if(units >601 )
    {
        println("--------------------------------")
        println("Customer Number: $username")
        println("Consumption unit: $units")
        println("Payable Amount = ${390+(units - 600) * 1.00}")
    }
    else
    {
        println("Invalid Units")
    }
}