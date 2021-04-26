package core

fun main() {
    var str: String
// val moniterInchSize = 24
    when (24) {  //moniterInchSize
        15 -> str = "too small"
        in 16..18 ->
            str = "good for the pas decade"
        in 19..23 ->
            str = "for office work"
        in 24..27 ->
            str = "great choice"
        else ->
            str = ""
    }
    println(str)
}


