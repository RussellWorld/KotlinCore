package core

class Man {
    var name: String
    var country: String = ""

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, country: String) : this(name) {
        this.country = country
    }
}

fun main() {
    var man = Man("Vladimir", "Russia")
}