package core

import java.util.*


fun main() {
//Client
    val shape = Shape()
    val helper = ShapeHelper(shape)

    helper.move(2, 3)
    //shape.position is (2,3)
    helper.move(-3, 7)
    //shape.position -3, 7

    println("${shape.position.x}, ${shape.position.y}")
    helper.undo()
    //shape.position is 2, 3
    helper.undo()
    //shape.position is 0, 0
}

//State
class Point(var x: Int, var y: Int)

class Memento(private val state: Point) {
    fun getState(): Point {
        return state
    }
}

//Originator
class Shape {
    var position = Point(0, 0)

    fun move(left: Int, top: Int) {
        position.x += left
        position.y += top
    }

    fun getMemento(): Memento {
        val state = Point(
                position.x, position.y)
        return Memento(state)
    }

    fun setMemento(memento: Memento) {
        position = memento.getState()
    }
}

//Caretaker
class ShapeHelper(private val shape: Shape) {
    private val stack = Stack<Memento>()

    fun move(left: Int, top: Int) {
        stack.push(shape.getMemento())
        shape.move(left, top)
    }

    fun undo() {
        if (!stack.isEmpty()) {
            shape.setMemento(stack.pop())
        }
    }
}