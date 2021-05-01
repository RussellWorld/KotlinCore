package core


fun main() {
//Client
    val circle = Circle()
    circle.draw()
}

abstract class Shape {
    //Template method
    fun draw() {
        if (!canDraw()) {
            return
        }
        doDraw()
        notifyListeners()
    }

    fun canDraw(): Boolean {
        //if it possiable to draw the shape
        return true
    }

    //primitive operation
    protected abstract fun doDraw()

    fun notifyListeners() {
        println("shape is drawn")
    }
}

class Circle : Shape() {
    override fun doDraw() {
        println("draw a circle")
    }

}