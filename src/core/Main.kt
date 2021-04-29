package core

import kotlin.reflect.full.createInstance



fun main() {
    val carType = Car::class
    val car = carType.createInstance()

    println(car is Car)
}

class Car()