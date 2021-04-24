package core

open class Shape {
    private var uid = 0

    companion object {
        private var maxUID = 0
    }

    fun getUID(): Int {
        return uid
    }

    init {
        uid = ++maxUID
    }
}

class Square : Shape() {
    init {
        uid++ //<- Error
    }
}

fun main() {
    val square = Square()
    val uid = square.getUID()
    //uid is 1
    uid = square.uid //<- Error
}