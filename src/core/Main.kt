package core


open class Shape {}

open class Square : Shape()

open class redSquare : Shape()


fun main() {
    val square = Square()
    val isShape = square is Shape
    //isShape is True
    val isRedSquare = square is redSquare
    //isRedSquare is False
    println(isShape)
    println(isRedSquare)
}
