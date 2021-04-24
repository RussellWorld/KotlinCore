package core


abstract class Shape {
    var color = ""

    abstract fun fill(color: String)

    fun draw() {
        println(color)
    }
}

class Square : Shape {
    override fun fill(color: String) {
        this.color = color
    }
}


fun main() {
    val shape = Shape() //<- Error

    val square = Square()
    square.fill("Red")
    square.draw()

}