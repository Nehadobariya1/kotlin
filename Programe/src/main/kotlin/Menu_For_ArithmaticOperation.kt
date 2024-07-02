package org.example
import kotlin.system.exitProcess

fun main() {

    do{
        println("Menu for Arithmetic Operation: ")
        println("Enter 1 for Addition. ")
        println("Enter 2 for Subtraction. ")
        println("Enter 3 for Multiplication. ")
        println("Enter 4 for Division. ")
        println("Enter 5 for Exit. ")
        println("-------------------------------------------")
        println()

        print("Enter your Choice Number From Above Menu: ")
        var choiceNumber: Int = readLine()!!.toInt()
        var No1: Int
        var No2: Int
        when (choiceNumber) {

            1 -> {
                println("You selected Addition")
                print("Enter 1st Number: ")
                No1 = readLine()!!.toInt()
                print("Enter 2nd Number: ")
                No2 = readLine()!!.toInt()
                println()
                println("Addition of Two Number is :" + (No1 + No2))
            }

            2 -> {
                println("You selected Subtraction")
                print("Enter 1st Number: ")
                No1 = readLine()!!.toInt()
                print("Enter 2nd Number: ")
                No2 = readLine()!!.toInt()
                println()
                println("Subtraction of Two Number is :" + (No1 - No2))
            }

            3 -> {
                println("You selected Multiplication")
                print("Enter 1st Number: ")
                No1 = readLine()!!.toInt()
                print("Enter 2nd Number: ")
                No2 = readLine()!!.toInt()
                println()
                println("Multiplication of Two Number is :" + (No1 * No2))
            }

            4 -> {
                println("You selected Division")
                print("Enter 1st Number: ")
                No1 = readLine()!!.toInt()
                print("Enter 2nd Number: ")
                No2 = readLine()!!.toInt()
                println()
                println("Division of Two Number is :" + (No1 / No2))

            }

            5 -> print("")
        }
        println()
    }while(choiceNumber != 5)

//    while(true)
//    {
//        println("Menu for Arithmetic Operation: ")
//        println("Enter 1 for Addition. ")
//        println("Enter 2 for Subtraction. ")
//        println("Enter 3 for Multiplication. ")
//        println("Enter 4 for Division. ")
//        println("Enter 5 for Exit. ")
//        println("-------------------------------------------")
//        println()
//
//        print("Enter your Choice Number From Above Menu: ")
//        var choiceNumber : Int = readLine()!!.toInt()
//        when(choiceNumber) {
//
//            1-> println("You selected Addition")
//            2-> println("You selected Subtraction")
//            3-> println("You selected Multiplication")
//            4-> println("You selected Division")
//            5-> println("You are Exit.")
//        }
//
//        print("Enter 1st Number: ")
//        var No1 : Int = readLine()!!.toInt()
//        print("Enter 2nd Number: ")
//        var No2 : Int = readLine()!!.toInt()
//        println()
//
//        when(choiceNumber)
//        {
//            1-> println("Addition of Two Number is :"+(No1 + No2))
//            2-> println("Subtraction of Two Number is :"+(No1 - No2))
//            3-> println("Multiplication of Two Number is :"+(No1 * No2))
//            4-> println("Division of Two Number is :"+(No1 / No2))
//            5-> println("Exit with Exit.")
//        }
//
//        println("-------------------------------------------")
//        println()
//
//    }
//
}