package core


fun main() {
    val n1 = arrayOf(5)
    val n2 = arrayOf(7)
    swap(n1, n2)
    //n1[0] is 7 and n2[0] is 5

    val s1 = arrayOf("cat")
    val s2 = arrayOf("dog")
    swap(s1, s2)
    //s1[0] is dog / s2[0] is cat

    println("n1[0] is ${n1[0]} and n2[0] is ${n2[0]}")
    println("s1[0] is ${s1[0]} and s2[0] is ${s2[0]}")


}

fun <T> swap(a: Array<T>, b: Array<T>) {
    val tmp = a[0]
    a[0] = b[0]
    b[0] = tmp

}

