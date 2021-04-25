package core

fun main() {
    val s1 = arrayOf("A")
    val s2 = arrayOf("B")
    swapStrings(s1, s2)
    //s1[0] is "B", s2[0] is "A"
    println("s1[0] = ${s1[0]}")
    println("s2[0] = ${s2[0]}")
}

fun swapStrings(s1: Array<String>, s2: Array<String>) {
    val temp = s2[0]
    s2[0] = s1[0]
    s1[0] = temp

}