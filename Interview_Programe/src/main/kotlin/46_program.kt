package org.example

//46. Get a string from user and check it is vowel or consonants

fun main()
{
    print("Enter a character:")
    var input = readLine()!!.toLowerCase()

    for(char in input)
    {
        if(char in 'a'..'z'){
        if(char == 'a'||char == 'e'||char == 'i'||char == 'o'||char == 'u')
        {
            println("$char is Vowel")
        }
        else
        {
            println("$char is consonants")
        }
        }else
        {
            println("INPUT ISN'T VALIDE")
        }
    }

}