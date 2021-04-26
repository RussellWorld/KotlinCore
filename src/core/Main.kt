package core

import java.lang.Exception

fun main() {
    try {
        trowWhenNullOrEmpty(null)
    } catch (e: Exception) {
        println("Error happened")
    }
}

class IsNullException : Exception() {}

class IsEmptyException : Exception() {}

fun trowWhenNullOrEmpty(list: Array<Int>?) {
    if (list.isNullOrEmpty()) {
        throw IsNullException()
    }
    if (!list.any()) {
        throw IsEmptyException()
    }
}