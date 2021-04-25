package core

fun main() {
    val rect = Rect(Point(3, 4), Size(10, 12))
    val area = rect.getArea()
    //area is 120
    println(area)
}

class Point(var x: Int, var y: Int) {}

class Size(var width: Int, var heigth: Int) {}

class Rect(val point: Point, var size: Size) {
    fun Size.area(): Int {
        return this.heigth * this.width
    }

    fun getArea(): Int {
        return size.area()
    }
}