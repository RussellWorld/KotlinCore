package core

fun main() {
    var i = 5
    var f5 = 1

    while (i > 1) {
        f5 *= i
        i--
    }
    //f5 is 120
    println(f5)
}

