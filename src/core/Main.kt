package core

fun main() {
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17, 19)
    var str = ""
    for (i in numbers) {
        if (i > 10) {
            break
        }
        if (str.isNotEmpty()) {
            str += "-"
        }
        str += i
    }
    //str is "2-5-11-17"
    println(str)
}

