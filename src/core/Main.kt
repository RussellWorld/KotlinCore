package core

import java.lang.Exception

fun main() {
    try {
        methodWithException()
    } catch (e: Exception) {
        println(e.message)
    }
}


fun methodWithException() {
    try {
        throw Exception("test exception")
    } catch (e: Exception) {
        //implementation of any partial processing
        //and send error to the calling code
        throw e

    }
}

