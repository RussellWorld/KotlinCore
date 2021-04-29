package core


fun main() {
    val avgFunc = { a: Int, b: Int ->
        (a + b) / 2
    }
    val avg = avgFunc(3, 5)
    //avg is 4

    println(avg)
}



