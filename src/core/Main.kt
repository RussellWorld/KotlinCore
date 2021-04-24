package core


open class Shape {
    open val lineCount: Int
        get() = 0
}

open class Square : Shape() {
    override val lineCount: Int
        get() = 4
}

fun main() {
    val square = Square()
    //square.lineCount is 4

}
