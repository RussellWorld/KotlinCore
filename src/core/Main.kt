package core

fun main() {
    val A = 3
    val B = 5
    val C = 7
    if (C >= A && C >= B) {
        println("nothing is lager than C.")
    }
    if (!(A >= B || A >= C)) {
        println("A is the smallest")
    }

}

