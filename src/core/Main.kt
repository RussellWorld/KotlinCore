package core


fun main() {
    var languages = hashMapOf(
            "ru" to "russian",
            "en" to "english"
    )

    var numbers = hashMapOf(
            1 to "one",
            2 to "two",
            3 to "three"
    )

    var employees = hashMapOf(
            1 to Employee("Pavlov", "Anton"),
            2 to Employee("Pavlov", "Anton")
    )

    println(languages["ru"])
    println(numbers[1])
    println(employees[1]?.FirstName)
}

class Employee(val FirstName: String, val LastName: String)

