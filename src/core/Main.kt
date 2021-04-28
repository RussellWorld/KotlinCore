package core


fun main() {
    val vehicle = Vehicle()
    val car = Car()
    val truck = Truck()

    val service = Service<Vehicle>()
    service.add(vehicle)
    service.add(car)
    service.test()

    service.add(truck) //<- Error
}

open class Vehicle {
    fun test() {

    }
}

class Car : Vehicle()

class Truck

class Service<T : Vehicle> {
    var list = mutableListOf<T>()

    fun add(item: T) {
        list.add(item)
    }

    fun test() {
        for (item in list) {
            item.test()
        }
    }
}
