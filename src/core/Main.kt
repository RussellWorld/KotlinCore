package core

import java.util.*

fun main() {
    val intQueue = LinkedList<Int>()
    intQueue.add(1)
    intQueue.add(3)
    intQueue.add(5)

    val top = intQueue.peek() //  top is 1

    val first = intQueue.poll() // 1

    val second = intQueue.poll() // 3

    val thrid = intQueue.poll() // 5

}

