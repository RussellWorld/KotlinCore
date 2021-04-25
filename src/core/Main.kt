package core

fun main() {
    val p1 = Point(1, 2)
    val str1 = p1.toText()
    //str1 is "x = 1; y = 2"

    p1.move(5, -1)
    val str2 = p1.toText()
    //str2 is "x = 6; y = 1"

    println(str1)
    println(str2)

}

class Point(var x: Int, var y: Int) {
    fun toText(): String {
        return "x = $x, y = $y"
    }

    fun move(right: Int, down: Int) {
        x += right
        y += down
    }
}
