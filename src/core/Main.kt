package core

import java.lang.Exception

fun main() {
    val seller = Seller()
    try {
        seller.sell() // <- Error
    } catch (e: Exception) {
        println(e.message)
        //e.message is "no car for sale
    }
}

class Car {}

class Seller {
    var cars = arrayOf<Car>()
    fun sell() {
        if (!cars.any()) {
            throw Exception("No cars for sale")
        }
    }
}
