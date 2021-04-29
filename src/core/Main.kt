package core

import java.io.*


fun main() {
    val dir = File("data_copy")
    if (dir.delete()) {
        println("successfully deleted")
    }
}



