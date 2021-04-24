package core

class Circle(val radius: Double) {
    val area: Double
        get() = Math.PI * Math.pow(radius, 2.0)
}

fun main() {
    val circle = Circle(2.0)
    //circle.Area is 12.56
    println(circle.area)
}
