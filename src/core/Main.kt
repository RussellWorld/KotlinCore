package core

fun main() {
    //Client
    var creator = Creator()
    creator.test()

    creator = ManagerCreator()
    creator.test()
}

//Product
open class Employee {
    open fun test() {
        println("Employee")
    }
}

//ConcreteProduct
class Manager : Employee() {
    override fun test() {
        println("Manager")
    }
}

//Creator
open class Creator {
    //FactoryMethod
    open fun createEmployee(): Employee {
        return Employee()
    }

    //Some operation
    fun test() {
        createEmployee().test()
    }
}

//ConcreteCreator
class ManagerCreator : Creator() {
    override fun createEmployee(): Employee {
        return Manager()
    }
}