package core

class Swap {
    fun strings(s1: Array<String>, s2: Array<String>) {
        val temp = s2[0]
        s2[0] = s1[0]
        s1[0] = temp
    }
}


fun main() {
    val s1 = arrayOf("A")
    val s2 = arrayOf("B")
    val swap = Swap()

    //s1[0] is "B", s2[0] is "A"
}