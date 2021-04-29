package core

import java.io.*
import java.lang.Exception


fun main() {
    val dir = File("data")
    val dirCopy = File("data_copy")
    try {
        dir.copyRecursively(dirCopy, true)
        println("successfully copied")
    } catch (e: Exception) {
        println(e.message)
    }
}



