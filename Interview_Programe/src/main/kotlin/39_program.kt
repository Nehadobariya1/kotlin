package org.example

fun main() {
    var no: Int

    do {
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")

        print("Enter Your Choice :")
        no =readLine()!!.toInt()


        when(no)
        {
            1->
            {
                println("You Selected Addition")
                print("Enter First Number : ")
                var no1 : Int =readLine()!!.toInt()
                print("Enter Second Number : ")
                var no2 : Int =readLine()!!.toInt()
                println("Addition is : ${no1+no2}")
            }

            2->{
                println("You Selected Subtraction")
                print("Enter First Number : ")
                var no1 : Int =readLine()!!.toInt()
                print("Enter Second Number : ")
                var no2 : Int =readLine()!!.toInt()
                println("Subtraction is : ${no1-no2}")
            }
            3->
            {
                println("You Selected Multiplication")
                print("Enter First Number : ")
                var no1 : Int =readLine()!!.toInt()
                print("Enter Second Number : ")
                var no2 : Int =readLine()!!.toInt()
                println("Multiplication is : ${no1*no2}")
            }
            4->
            {
                println("You Selected Division")
                print("Enter First Number : ")
                var no1 : Int =readLine()!!.toInt()
                print("Enter Second Number : ")
                var no2 : Int =readLine()!!.toInt()
                println("Division is : ${no1/no2}")
            }
            5->print("")
            else->
            {
                println("Invalid Choice")
            }
        }
        println()
    } while(no!=5)

}