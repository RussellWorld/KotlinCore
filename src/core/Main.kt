package core

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val getDistance = { p1: Point, p2: Point ->
        val d1 = 2.0.pow(p1.x - p2.x)
        val d2 = 2.0.pow(p1.y - p2.y)
        sqrt(d1 + d2)
    }
    val point = Point(0.0, 0.0)
    val point2 = Point(5.0, 5.0)
    val distance = getDistance(point, point2)
    //distance is 7.071
    println(distance)
}

class Point(var x: Double, var y: Double)



