package core

fun main() {
    var i = 7
    var f7 = 1

    do {
        f7 *= i
        i--
    } while (i > 1)
    //f7 is 5040

    println(f7)
}

