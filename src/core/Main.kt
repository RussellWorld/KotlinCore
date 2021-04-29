package core

import java.util.concurrent.Executors


fun main() {
    val threahPool = Executors.newFixedThreadPool(10)

    //start ten threads
    for (i in 1..10) {
        val action = Runnable {
            showNumber(i)
        }
        threahPool.execute(action)
    }
    threahPool.shutdown()
}

fun showNumber(number: Int) = synchronized(lock = Any()) {
    Thread.sleep((2500..5500).random().toLong())
    print("$number, ")
}