package core

fun main() {
    val square = Shape(4, "Square")
    val squareCopy = square.copy()

    println(squareCopy.name)
}

class Shape(val lineCount: Int, val name: String) {
    fun copy(): Shape {
        return Shape(lineCount, name)
    }
}
