package core

fun main() {
    val p1 = Point(1, 2)
    //p1.x is 1 and p1.y is 2

    val p2 = Point()
    //p2.x is 0 and p2.y is 0

    println("p1 is (${p1.x}, ${p1.y})")
    println("p1 is (${p2.x}, ${p2.y})")

}

class Point {
    var x = 0
    var y = 0

    constructor()
    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }
}
