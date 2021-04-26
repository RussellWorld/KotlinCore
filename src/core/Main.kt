package core


fun main() {
    val n: Int? = 2

    var value = n ?: -1

    //which is equal to
    if (n != null)
        value = n
    else
        value = -1
}

