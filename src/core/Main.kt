package core

fun main() {
    val p1 = ColorPoint(0, 0)
    val x1 = p1.x
    //x1 is 0

    val p2: ColorPoint
    val x2 = p2.x // <- Error
}

class ColorPoint(var x: Int, var y: Int)