package core

import java.io.*
import java.lang.Exception
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption


fun main() {
    val file = Paths.get("file.txt")
    val toFile = Paths.get("new_file.txt")
    try {
        Files.move(file, toFile, StandardCopyOption.REPLACE_EXISTING)
        println("file moved")
    } catch (e: Exception) {
        println(e.message)
    }
}



