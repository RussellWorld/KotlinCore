package core

import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectOutputStream


fun main() {
    val numbers = arrayOf(1, 2, 3)
    try {
        val fos = FileOutputStream("file.out")
        val out = ObjectOutputStream(fos)
        out.writeObject(numbers)
        out.close()

    } catch (e: IOException) {
        println(e.message)
    }

}



