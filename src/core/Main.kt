package core


open class Shape {
    open val name: String
        get() = "Shape"
}

open class Square : Shape() {
    override val name: String
        get() = "Square"
}


fun main() {
    var square = Square()

    //implicit method
    val shape1: Shape = square

    //explicit first method
    val shape2 = square as Shape
}
