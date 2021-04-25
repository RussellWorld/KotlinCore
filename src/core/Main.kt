package core


fun main() {
    //the first method
    val strPi = "3.14"
    val pi = strPi.toFloat()
    println(pi)

    //the second method
    val strExp = "2.71828"
    val exp = strExp.toFloatOrNull()
    if (exp != null) {
        println(exp)
    }

    //the third method
    val strHalf = "0,5"
    val half = strHalf.replace(",", ".").toDouble()
    println(half)
}

