package org.example
fun main() {
//    //48. Print 1 to 10
//    for (i in 1..10) {
//        print("$i ")
//    }
//    println()
//
//    //49. Print 2 4 6 8 10
//    for (i in 2..10 step 2) {
//        print("$i ")
//    }
//    println()
//
//    //50. Print 1 3 5 7 9
//    for (i in 1..10 step 2) {
//        print("$i ")
//    }
//    println()
//
//    //51.Print 1 2 4 8 16 32 64 128 256 512 1024
//    var num = 1
//    for (i in 1..11) {
//        print("$num ")
//        num *= 2
//    }
//    println()
//
//    //52. Print 10 to 1
//    for (i in 10 downTo 1) {
//        print("$i ")
//    }
//    println()
//
//    //53. Print 1 10 2 9 3 8 4 7 5 6
//    for (i in 1..5) {
//        print("$i ${11 - i} ")
//
//    }
//    println()
//
//    //54. Print 1 2 3 5 6 7 9 -_ _ _ n
//    var n = 50
//    for (i in 1..n) {
//        if (i % 4 != 0) {
//            print("$i ")
//        }
//    }
//    println()
//
//    //55. Input and number display table of that number
//    var count = 1
//    var table = 10
//    for (i in 1..10) {
//        println("$table * $count = ${table * count}")
//        count++
//    }
//    println()
//
//    //56. Print series of 1/1, 1/2, 1/3, _ _ _ 1/N
//    var N = 10
//    for (i in 1..N) {
//        print("1/$i ")
//    }
//    println()
//
////    57. Print series of 1/2, 2/3, 3/4, 4/5, _ _ _ N/N+1
//    var n1 = 10
//    for (i in 1..n1) {
//        print("$i/${i + 1} ")
//    }
//    println()
//
////    58. Print series 1 + 4 – 9 + 16 – 25 + 36 + _ _ _ + N2
//    var sum = 0
//    for (i in 1..100) {
//        val n = i * i
//        if (i % 2 == 1) {
//            sum += n
//            print(" + $n")
//        } else {
//            sum -= n
//            print(" - $n")
//        }
//    }

//
//    println()
//
//
////    59. Print 0 1 1 2 3 5 8 13 21 34 55 (Fibonacci)
//    var n2 = 11
//    var a = 0
//    var b = 1
//    print("$a $b ")
//
//    for (i in 3..N) {
//        val next = a + b
//        print("$next ")
//        a = b
//        b = next
//    }
//    println()
//
////    60. Print factorial value of given number
//    var chekno=6
//    var fact=1
//    for (i in 1..chekno)
//    {
//         fact*=i
//    }
//    print("factorial of $chekno is : $fact " )
//    println()

//    61. Check whether the number is prime or not

//    print("Enter a number : ")
//    var num= readln().toInt();
//    var count =0;
//    for (i in 1..num)
//    {
//        if(num%i==0)
//        {
//            count++
//        }
//    }
//    if(count ==2)
//    {
//        print("$num is a prime number ")
//    }
//    else
//    {
//        print("$num is not a prime number")
//    }
//    println()

////    62. Print prime number between given range
//    var falg=false
//    for (i in 1..20)
//    {
//        var flag=true
//        for(j in 2 until i)
//        {
//            if(i%j==0)
//            {
//                flag=false
//                break
//            }
//        }
//        if(flag)
//        {
//            println("$i ")
//        }
//
//    }
//
//   // println()
////    63. Write program that display square, cubes and factorials of all integer from 1 to 10
//
//    for(i in 1..10)
//    {
//        println("Square of $i is : ${i*i}")
//        println("Cube of $i is : ${i*i*i}")
//        print("factor of $i is : ")
//        for (j in 1..i)
//        {
//            if(i%j == 0)
//            {
//                print("$j")
//            }
//        }
//        println()
//    }


//   64. Display sum of digit
//    print("Enter first number : ")
//    var num = readln().toFloat();
//    print("Enter second number : ")
//    var num1 = readln().toFloat()
//    println("Sum of the digits is: ${num+num1}")

////    65. Display reverse number
//    print("Enter a number : ")
//    var num = readln().toInt()
//    var temp=num;
//    var reverse=0
//    while (temp>0)
//    {
//        var rem=temp%10;
//        reverse=(reverse*10)+rem;
//        temp/=10
//    }
//    println("The reverse number is : $reverse")

////    66. Check entered number is Armstrong or not
//    print("Enter a number : ")
//    var num = readln().toInt()
//    var temp=num;
//    var arm=0
//    while (temp>0)
//    {
//        var rem=temp%10;
//        arm+=(rem*rem*rem);
//        temp/=10
//    }
//    if(arm==num) {
//        println("The given  number $num is armstrong ")
//    }
//    else
//    {
//        println("The given number $num is not an armstrong number ")
//    }
////    67. Check entered number is palindrome or not
//    print("Enter a number : ")
//    var num = readln().toInt()
//    var temp=num;
//    var reverse=0
//    while (temp>0)
//    {
//        var rem=temp%10;
//        reverse=(reverse*10)+rem;
//        temp/=10
//    }
//    if(num == reverse)
//    {
//        println("The given number $num is palindrome.")
//    }
//    else
//    {
//        println("The given number $num is not palindrome.")
//    }

////    68. Count odd and even digits from given number
//    print("Enter a number : ")
//    var num = readln().toInt()
//    var temp=num;
//    var even=0;
//    var odd=0
//    while (temp>0)
//    {
//        var rem=temp%10;
//        if(rem%2==0)
//        {
//            even++
//        }
//        else{
//            odd++
//        }
//        temp/=10
//    }
//    println("The given number $num has $even even digits and $odd odd digits")
////     69. Accept number and find how many zeros are there
//    print("Enter a number : ")
//    var num = readln().toInt()
//    var temp=num;
//    var count=0
//    while (temp>0)
//    {
//        var rem=temp%10;
//        if(rem==0)
//        {
//            count++
//        }
//        temp/=10
//    }
//    println("The given number $num has $count zeros ")
//    70. Count digits of given number
//    print("Enter a number : ")
//    var num = readln().toInt()
//    var temp=num;
//    var count=0
//    while (temp>0)
//    {
//        temp%10;
//        count++
//        temp/=10
//    }
//    println("The given number $num has $count digits ")



}