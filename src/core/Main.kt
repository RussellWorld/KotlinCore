package core

import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val p1 = Point(1.0, 3.0)
    val p2 = Point(2.0, 4.0)
    val distance = Point.distanceTo(p1, p2)
    //distance is 1.4142
    println(distance)

}

class Point(var x: Double, var y: Double) {
    companion object {}
}

fun Point.Companion.distanceTo(p1: Point, p2: Point): Double {
    val d1 = pow(p1.x - p2.x, 2.0)
    val d2 = (p1.y - p2.y).pow(2.0)
    return sqrt(d1 + d2)
}
