package core


fun main() {
    val car = Airwave(1500, "Honda Airwave")
    println(car.name)
}

interface ICar {
    val engineVolume: Int
    val name: String

}

class Airwave(override var engineVolume: Int,
        override val name: String) : ICar



