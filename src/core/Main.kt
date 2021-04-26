package core

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(2, 3)

    val b1 = p1 > p2
    //b1 is False
    val b2 = p1 < p2
    //b2 is True

}

class Point(var x: Int, var y: Int) {
    operator fun compareTo(p: Point): Int {
        if (x > p.x && y > p.y)
            return 1
        else if (x == p.x && y == p.y)
            return 0
        else return -1
    }
}
