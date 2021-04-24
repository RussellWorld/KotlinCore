package core


open class Shape {}

open class Square : Shape()

open class redSquare : Shape()

fun main() {
    val square = Square()
    val shape = square as Shape
    //shape is Shape
    val redSquare = square as? redSquare
    //redSquare is null

}
