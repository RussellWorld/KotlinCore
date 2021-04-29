package core

import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption


fun main() {
    try {
        //first method
        File("file1.txt").printWriter().use { out ->
            out.println("Line 1")
            out.println("Line 2")
        }

        //second method
        val lines = mutableListOf("Line 1", "Line 2")
        val file = Paths.get("file2.txt")
        Files.write(file, lines, Charset.defaultCharset())

        //thrid method
        File("file3.txt").writeText("Line 1\nLine 2")
    } catch (e: IOException) {
        println(e.message)
    }
}



