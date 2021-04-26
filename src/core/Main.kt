package core


fun main() {
    var str = "1-3-2"
    var arStr = str.split("").toTypedArray()
    arStr[3] = "2"
    arStr[5] = "3"
    str = arStr.joinToString("")
    println(str)
}

