package core

import java.io.*
import java.lang.Exception


fun main() {
    val file = File("file.txt")
    try {
        file.delete()
        println("file deleted")
    }catch (e: Exception){
        println(e.message)
    }
}



