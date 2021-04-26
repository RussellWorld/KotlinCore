package core

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(2, 2)
    val p3 = Point(1, 1)
    val equal1 = p1 == p2
    //equal is False
    val equal2 = p1 == p3
    //equal2 is False
    val equal3 = p1 != p3
    //equal3 is True
    println(equal1)
    println(equal2)
    println(equal3)

}

class Point(var x: Int, var y: Int) {
    override fun equals(other: Any?): Boolean {
        return (other is Point) && (x == other.x) && (y == other.y)
    }
}
