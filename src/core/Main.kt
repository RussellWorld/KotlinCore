package core

fun main() {
//Client
    val square = Square()
    square.showInfo()
    //square
    println()

    val colorShape = ColorShape(square, "red")
    colorShape.showInfo()
    //red square
    println()

    val shadowShape = ShadowShape(colorShape)
    shadowShape.showInfo()
    //red square with shadow
}

//Component
interface IShape {
    //Operation
    fun showInfo()
}

//ConcreteComponent
class Square : IShape {
    override fun showInfo() {
        print("square")
    }
}

//Decorator
abstract class ShapeDecorator(protected var shape: IShape) : IShape {
    override fun showInfo() {
        shape.showInfo()
    }
}

//ConcreteDecorator
class ColorShape(shape: IShape, var color: String) : ShapeDecorator(shape) {
    override fun showInfo() {
        print("$color ")
        shape.showInfo()
    }
}

//ConcreteDecorator
class ShadowShape(shape: IShape) : ShapeDecorator(shape) {
    override fun showInfo() {
        shape.showInfo()
        print(" with shadow")
    }

}