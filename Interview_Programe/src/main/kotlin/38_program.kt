package org.example

fun main() {
    println()
    print("Enter your are age:")
    var age = readLine()!!.toInt()

    if(age>0 && age<5)
    {
        println("Kid")
    }
    else if(age >= 5 && age <=12)
    {
        println("Children")
    }
    else if(age >= 13 && age <=19)
    {
        println("Teenager")
    }else if(age >= 20 && age <=30)
    {
        println("Young")
    }else if(age >= 31 && age <60)
    {
        println("Mid age group ")
    }else if(age >= 60 )
    {
        println("Old")
    }
    else
    {
        println("Invalid age")
    }




}