package core


fun main() {
    val dataString = "Substring search"

    if (dataString.contains("string")) {
        println("contain \"string\"")
    }
    if (dataString.startsWith("Sub")) {
        println("starts with \"Sub\"")
    }
    if (dataString.endsWith("search")) {
        println("ends with \"search\"")
    }
}

