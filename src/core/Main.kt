package core

fun main() {
    val redPoint = RedPoint(1, 2)

    println(redPoint.toText())

}

interface IText {
    fun toText(): String
}

open class Point(var x: Int, var y: Int) : IText {
    override fun toText(): String {
        return "x = $x, y = $y"
    }
}

class RedPoint(x: Int, y: Int) : Point(x, y)