package core

class ArrayAssistant(var data: Array<Int>) {
    fun getFirstLast(): Pair<Int, Int> {
        var first = -1
        var last = -1
        val len = data.size
        if (len > 0) {
            first = data[0]
            last = data[len - 1]
        }
        return Pair(first, last)
    }
}


fun main() {
    val ar = arrayOf(2, 3, 5)
    val assistant = ArrayAssistant(ar)
    val (first, last) = assistant.getFirstLast()
    //first is 2
    //last is 5

    println("first = $first")
    println("last = $last")
}
