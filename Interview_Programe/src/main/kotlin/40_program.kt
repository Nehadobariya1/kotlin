package org.example

//40. Write a program input 5 subject marks and find class and result
fun main() {

    print("input 5 subject marks and find class and result")
    println()
    println("Enter marks of above subject:")
    print("Marks of JAVA --> ")
    var java = readLine()!!.toInt()
    print("Marks of python --> ")
    var python = readLine()!!.toInt()
    print("Marks of Laravel --> ")
    var Laravel = readLine()!!.toInt()
    print("Marks of Android --> ")
    var android = readLine()!!.toInt()
    print("Marks of ASP.Net --> ")
    var ASP = readLine()!!.toInt()

    println("One the bases of your Marks your class and Result :")
    var result = (java+python+android+Laravel+ASP)/5
    print("Percentage is = $result%")

    if(result >= 85)
    {
        print(" and 'Pass with Distinction'")
    }
    else if(result >= 70 && result < 85)
    {
        print(" and 'Pass with 'First class'")
    }
    else if(result >= 60 && result < 70)
    {
        print(" and 'Pass with 'Second class'")
    }
    else if(result >= 45 && result < 60)
    {
        print(" and 'Pass with 'Third class''")
    }
    else if(result > 0 && result < 45)
    {
        println(" and you want to 'Re-Appear'")
    }
    else
    {
        print("Invalid Input")
    }







}