package org.example

fun main()
{
    //1.

    for(i in 1..5)
    {
        for(j in 1..5)
        {
            print("$j ")
        }
        println()
    }

    println()

    //2.

    for(i in 1..5)
    {
        for(j in 1..5)
        {
            print("$i ")
        }
        println()
    }
    println()
    //3.

    for(i in 1..5)
    {
        for(j in 1..5)
        {
            print("${i * j} ")
        }
        println()
    }
    println()

    //4.

    // val alphabet = "ABCDE"
    for(char in 'A'..'E')
    {
        for(i in 1..5)
        {
            print("$char ")
        }
        println()
    }
    println()

    //5.

    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(j<i)
            {
                print("$ ")
            }else
            {
                print("$j ")
            }
        }
        println()
    }
    println()

    //6.

    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(j<=i)
            {
                print("$i ")
            }else
            {
                print("$ ")
            }
        }
        println()
    }
    println()


    //7.
    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(j<=i)
            {
                print("X ")
            }else
            {
                print("O ")
            }
        }
        println()
    }
    println()

    //8.

    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i==1 || i==5 || j==1 || j==5 )
            {
                print("* ")
            }
            else
            {
                print("  ")
            }
        }
        println()
    }
    println()

    //9.
    for(i in 1..5)
    {
        for (j in 1..5)
        {
            if(i >= j)
            {
                print("$i ")
            }else
            {
                print(" ")
            }
        }
        println()
    }
    println()

    //10.
    for(i in 1..5)
    {
        for (j in 1..5)
        {
            if(i >= j)
            {
                print("$j ")
            }else
            {
                print(" ")
            }
        }
        println()
    }
    println()

    //11.

    for(i in 5 downTo 1)
    {
        for (j in 5 downTo i)
        {
                print("$j ")
        }
        println()
    }
    println()

    //12.
    for(i in 1..5)
    {
        for (j in i downTo 1)
        {
            print("$j ")
        }
        println()
    }
    println()

    //13.
    var k=1
    for(i in 1..5)
    {
        for(j in 1..i)
        {
            print("$k ")
            k++
        }
        println()
    }
    println()

    //14.



    //15.

    for(i in 1..5)
    {
        for(j in 1..i)
        {
            if( j % 2 == 1)
            {
                print("1 ")
            }
            else
            {
                print("0 ")
            }
        }
        println()
    }
    println()

    //16.
    var char='A'
    for(i in 1..5)
    {
        for(j in 1..i)
        {
            print("$char ")
            char++
        }
        println()
    }
    println()

    //17.

    for (i in 1..5) {
        for(j in 1..5 - i) {
            print("  ")
        }
        for(k in 1..i) {
            print("* ")
        }
        println()
    }
    println()
    //18.

    for(i in 5 downTo 1)
    {
        for (j in  5 downTo 6-i)
        {
            print("* ")
        }
        println()
    }
    println()

    //19.

    for(i in 1..5)
    {
        for(j in 1..5-i)
        {
            print(" ")
        }
        for (k in 1..i)
        {
            print("* ")
        }
        println()
    }

}
