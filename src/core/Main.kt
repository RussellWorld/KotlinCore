package core


fun main() {
    val size = Size()
    size.width = 10
    size.height = 10

    val point = Point()
    point.x = 5
    point.y = 5

    val rect = Rect()
    rect.size = size
    rect.point

    println(rect.point.x)
}

class Point {
    var x = 0
    var y = 0
}

class Size {
    var wigth = 0
    var height = 0

}

class Rect {
    lateinit var size: Size
    lateinit var point: Point
}

