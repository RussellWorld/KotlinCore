package core

import java.io.File
import java.io.IOException


fun main() {
    try {
        val text = File("file1.txt")
                .readText()
        println(text)

    } catch (e: IOException) {
        println(e.message)
    }

}



