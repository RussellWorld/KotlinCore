package core

class Log(var lastData: String) {
    fun print5(data: String) {
        lastData = data
        if (data.length > 5) {
            data = data.substring(0, 5)
        } //<- Error
        println(data)

    }
}


fun main() {
    val log = Log("")
    log.print5("1234567")
    //printed "12345"
    println("lastData = ${log.lastData}")
}