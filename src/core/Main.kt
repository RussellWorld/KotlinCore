package core


fun main() {
    val n1 = arrayOf(1, 2, 3)
    val n2 = arrayOf(1, 2, 3)
    val n3 = arrayOf(3, 2, 1)

    val equal = n1 contentEquals n2
    //true

    val equal2 = n1 contentEquals n3
    //false


}





