package core


class Car(var model: String, var year: Int, var price: Int)

class ToyotaPrices {
    val cars = mutableListOf<Car>()
    operator fun get(model: String, year: Int): Int {
        val car = findCar(model, year) ?: return 0
        return car.price
    }

    operator fun set(model: String, year: Int, price: Int) {
        val car = findCar(model, year)
        if (car == null) {
            val newCar = Car(model, year, price)
            cars.add(newCar)
        } else
            car.price = price
    }

    private fun findCar(model: String, year: Int): Car? {
        for (car in cars) {
            if (car.model == model && car.year == year) {
                return car
            }
        }
        return null
    }
}


fun main() {
    val prices = ToyotaPrices()
    prices["Rush", 2012] = 16818
    prices["Land Cruiser", 2014] = 54988

    val priceRAV4 = prices["RAV4", 2015]
    //priceRAV4 is 0
    val priceRush = prices["Rush", 2012]
    //priceRush is 16818

    println(priceRAV4)
    println(priceRush)
}
