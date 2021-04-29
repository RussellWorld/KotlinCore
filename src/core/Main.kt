package core

import java.io.*


fun main() {

    try {
        val fis = FileInputStream("file.out")
        val ois = ObjectInputStream(fis)
        val obj = ois.readObject()
        ois.close()

        if (obj is Array<*>) {
            val numbers = obj as Array<Int>
            numbers.forEach { print("$it ") }
        }

    } catch (e: IOException) {
        println(e.message)
    }

}



