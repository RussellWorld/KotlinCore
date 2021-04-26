package core

import java.lang.Exception
import java.lang.RuntimeException

fun main() {

}

fun methodWithException(): Nothing {
    throw Exception("test exception")
}

fun methodWithRuntimeException() {
    throw RuntimeException("test exception")
}