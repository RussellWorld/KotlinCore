package core

fun main() {

    val square = Square()
    val maker = ShapeMaker(square)

    val square1 = maker.makeShape()
    val square2 = maker.makeShape() as Square

    println(square1)
    println(square2.lineCount)
}

//Prototype
interface Shape {
    fun clone(): Shape
}

//ConcretePrototype
class Square(var lineCount: Int = 4) : Shape {
    override fun clone(): Shape {
        return Square(lineCount)
    }
}

//Client
class ShapeMaker(var shape: Shape) {
    fun makeShape(): Shape {
        return shape.clone()
    }
}