package core

import java.util.*

fun main(args: Array<String>) {
    print("Enter name: ")
    val reader = Scanner(System.`in`)
    val name = reader.nextLine()

    print("Enter age: ")
    val age = reader.nextInt()
    print("Hello, $name! Your age is $age")
}