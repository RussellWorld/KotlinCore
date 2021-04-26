package core

fun main() {
    var rect = Rect(Point(3, 4), Size(10, 12))
    //There is no with expression in Kotlin
    rect.point.apply {
        x += 1
        y += 1
    }

}

class Point(var x: Int, var y: Int) {}

class Size(var width: Int, var height: Int) {}

class Rect(val point: Point, var size: Size) {}



