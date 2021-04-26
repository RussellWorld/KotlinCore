package core


fun main() {
    val stringReverse = Reverse("String")
    //stringReverse is gnirtS
    println(stringReverse)
}

fun Reverse(word: String): String {
    //Character count
    val charCount = word.length
    var result = ""
    for (i in charCount - 1 downTo 0) {
        result += word[i]
    }
    return result
}
