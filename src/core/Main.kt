package core


fun main() {
    val nokiaPhone = Phone()
    nokiaPhone.model = "Nokia 6610"

    val kim = Employee()
    kim.firstName = "Victoriya"
    kim.lastName = "Kim"
    kim.personalPhone = nokiaPhone

    println(kim.personalPhone.model)
}

class Phone {
    var model = ""
}

class Employee {
    var firstName = ""
    var lastName = ""
    lateinit var personalPhone: Phone

}