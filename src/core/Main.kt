package core

import kotlin.reflect.full.createInstance


fun main() {
    val carType = Car::class
    val car = carType.createInstance()

    val method = car::increaseSpeed
    method.invoke(10)

    val field = car::speed
    val speed = field.get()
    //speed is 10

    println("Test speed = $speed")
}

class Car() {
    var speed = 0

    fun increaseSpeed(value: Int) {
        speed += value
    }
}