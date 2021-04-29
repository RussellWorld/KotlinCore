package core

import java.io.*


fun main() {
    val path = System.getProperty("user.dir")

    File(path).walk()
            .filter { it.extension == "txt" }.forEach { println(it) }
}



