package core


fun main() {
    val first = "A"
    val second = "B"
    val third = "A"

    val areEqual1 = first == second
    //areEqual1 is false

    val areNotEqual = first != second
    //areNotEqual is true

    val areEqual2 = first.compareTo(third) == 0
    //areEqual2 is true

}

