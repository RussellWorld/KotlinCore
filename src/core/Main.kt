package core

import java.io.FileWriter
import java.io.IOException
import java.nio.charset.Charset
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption



fun main() {
    try {
        //fist method
        val fw = FileWriter("file1.txt", true)
        fw.write("Line 3\nLine 4")
        fw.close()

        //second method
        val lines = mutableListOf("Line 3", "Line 4")
        val file2 = Paths.get("file2.txt")
        Files.write(file2, lines, Charset.defaultCharset(), StandardOpenOption.APPEND)

        //thrid method
        val file3 = Paths.get("file3.txt")
        Files.write(file3, "\n Line 3 \n Line 4".toByteArray(), StandardOpenOption.APPEND)
    } catch (e: IOException) {
        println(e.message)
    }
}



