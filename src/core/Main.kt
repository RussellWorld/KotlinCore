package core


fun main() {
    val sizeInt = Size<Int>(5, 6)
    val textInt = sizeInt.asText()
    //textInt is "[5; 8]"

    val sizeDouble = Size(3.7, 1.57)
    val textDouble = sizeDouble.asText()


    println(textInt)
    println(textDouble)
}

class Size<T>(var width: T, var height: T) {
    fun asText(): String {
        return "[$width; $height]"
    }
}