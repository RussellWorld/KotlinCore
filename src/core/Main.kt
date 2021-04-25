package core

import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val p1 = Point(1.0, 3.0)
    val p2 = Point(2.0, 4.0)
    val distance = p1.distanceTo(p2)
    //distance is 1.4142
    println(distance)

}

class Point(var x: Double, var y: Double)

fun Point.distanceTo(p: Point): Double {
    val d1 = pow(this.x - p.x, 2.0)
    val d2 = (this.y - p.y).pow(2.0)
    return sqrt(d1 + d2)
}
