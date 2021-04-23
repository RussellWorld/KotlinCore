package core

abstract class Man {
    val name: String

    constructor(name: String) {
        this.name = name
    }
}

class Employee : Man {
    val position: String

    constructor(name: String) : super(name) {
        this.position = "unknown"
    }
}

fun main() {
    val employee = Employee("Max")
    //employee.position is "unknown"
}