package core

import java.io.*


fun main() {
    val file = File("file.txt")
    val fileCopy = File("file_copyl.txt")
    file.copyTo(fileCopy, true)
}



