package core

fun main() {
    val kettle = Kettle()
    val toaster = Toaster()
    val refrigetator = Refrigetator()
    val kitchen = Kitchen(kettle, toaster, refrigetator)
    kitchen.off()
}

//Complex parts
class Kettle {
    fun turnOff() {
        println("Kettle turn off")
    }
}

class Toaster {
    fun turnOff() {
        println("Toaster turn off")
    }
}

class Refrigetator {
    fun turnOff() {
        println("Refrigetator turn off")
    }
}

//Facade
class Kitchen(var kettle: Kettle, var toaster: Toaster, var refrigetator: Refrigetator) {
    fun off() {
        kettle.turnOff()
        toaster.turnOff()
        refrigetator.turnOff()
    }
}