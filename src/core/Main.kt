package core


open class Shape {
    open fun fill(color: String) {
        println("Fill implementation")
    }
}

class Square : Shape() {
    override fun fill(color: String) {
        println("New fill implementation")
    }
}


fun main() {
    var square = Square()
    square.fill("Red")
    //Use Square new fill implementation
}
