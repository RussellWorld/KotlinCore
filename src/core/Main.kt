package core

fun main() {
    val p1 = Point(1, 1)
    val p2 = Point(2, 2)
    var p3 = p1 + p2
    //p3.x is 3 and p3.y is 3
    println(p3)
    p3 += Point(3, 5)
    //p3.x is 6 and p3.y is 8
    println(p3)
}

data class Point(var x: Int, var y: Int) {
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }
}
