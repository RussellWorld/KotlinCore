package core

fun main() {
    val dic = mapOf(
            1 to "one", 2 to "two"
    )
    var str = ""
    for ((k, v) in dic) {
        if (str.isNotEmpty()) {
            str += ", "
        }
        str += "{$k, \"$v\" }"
        //str is { 1, "One"} , {2, "two" }
    }
    println(str)
}

