package core


fun main() {
    val nokiaPhone = Phone("Nokia 6610")

    val kim = Employee("Victoriya",
    "Kim",
    nokiaPhone)

    println(nokiaPhone.model)
    println(kim.personalPhone.model)
}

class Phone(var model: String)

class Employee(var firstName: String,
               var lastName: String,
               var personalPhone: Phone)
