package core


fun main() {
    val thread = MyThread()
    thread.start()
}

class MyThread : Thread() {
    override fun run() {
        println("in my tread")
    }
}