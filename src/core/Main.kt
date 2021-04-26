package core

import java.lang.Exception

fun main() {
    throw SimpleException()

    throw RecommendExc("exception")

}

class SimpleException : Exception() {}

class RecommendExc : Exception {
    //recommended constructors
    constructor() : super()
    constructor(message: String) : super(message)
}