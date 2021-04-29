package core


fun main() {
    val thread = AddThread()
    thread.priority = Thread.MIN_PRIORITY
    thread.start()
    println("main thread")

    //output:
    //main thread
    //result: 8
}

class AddThread : Thread() {
    private fun add(a: Int, b: Int): Int {
        sleep(3_000)
        return a + b
    }

    override fun run() {
        val result = add(3, 5)
        println("result: $result")
    }
}