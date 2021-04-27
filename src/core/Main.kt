package core


fun main() {
    val numbers = arrayOf(2, 3, 4, 5, 6, 7, 8, 15, 18)
    var str = ""
    for (number in numbers) {
        if (str.isNotEmpty()) {
            str += "; "
        }
        str += number.toString()
    }
    // 2; 3; 4; 5; 6; 7; 8; 15; 18
    println(str)
}





