package core


fun main() {
    val numbers = arrayOf(2, 3, 4, 5, 6, 7, 8, 15, 18)
    var str = ""
    for ((i, _) in numbers.withIndex()) {
        if (str.isNotEmpty()) {
            str += "; "
        }
        str += numbers[i].toString()
    }
    // 2; 3; 4; 5; 6; 7; 8; 15; 18
    println(str)
}





