package core

class Car(var Mark: String = "")

fun main() {
    val car1 = Car()
    val car2 = Car()
    val car3 = car1

    val equal1 = car1 == car2
    //equal1 is False

    val equal2 = car1 == car3
    //equal2 is True

    println(equal1)
    println(equal2)
}
