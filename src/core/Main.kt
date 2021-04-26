package core

import java.util.*


fun main() {
    val intStack = Stack<Int>()
    intStack.push(1)
    intStack.push(3)
    intStack.push(5)

    val top = intStack.peek()
    //top is 5
    val first = intStack.pop()
    //first is 5
    val second = intStack.pop()
    //second is 3
    val thrid = intStack.pop()
    //thrid is 1
    println("$top, $first, $second, $thrid")
}

