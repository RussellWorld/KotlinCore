package core


fun main() {
    val list = mutableListOf<Vehicle>()
    val vehicle = Vehicle()
    val car = Car()
    val truck = Truck()

    list.add(vehicle)
    list.add(car)
    list.add(truck)

    for (curVehicle in list) {
        curVehicle.test()
    }

}

open class Vehicle {
    fun test() {

    }

}

class Car : Vehicle()

class Truck : Vehicle()