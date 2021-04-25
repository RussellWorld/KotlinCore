package core

fun main() {
    print5("123456")
    //print "12345
}

fun print5(data: String) {
    if (data.length > 5) {
        data = data.substring(0, 5) //<-Error
    }
    println(data)
}