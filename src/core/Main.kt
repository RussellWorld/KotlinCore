package core


fun main() {
    val i = 5
    val action = {
        Thread.sleep(3_000)
        println(i * 10)
    }
    //Run lambda at new thread
    val thread = Thread(action)
    thread.start()
}
