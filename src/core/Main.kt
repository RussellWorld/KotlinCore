package core

//first method
abstract class Man(var name: String)

class Employee(var position: String,
               name: String) : Man(name)

//second method
abstract class Man {
    public var name: String

    constructor(name: String) {
        this.name = name

    }
}

class Employee : Man {
    var position: String

    constructor(name: String, position: String) : super(name) {
        this.position = position
    }
}


val employee = Employee("booker", "Max")
