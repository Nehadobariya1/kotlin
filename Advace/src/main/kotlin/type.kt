package org.example

fun main() {
    var name:String = "Atmiya"
    println(name::class.simpleName)   //Wrapper class

    println(name::class.java.typeName)  //primitive type
}