package core


fun main() {
    val service = Service<IVehicle>()
    service.add(Car())
    service.test()
}

interface IVehicle {
    fun test()
}

class Car : IVehicle {
    override fun test() {

    }
}

class Truck

class Service<T : IVehicle> {
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
