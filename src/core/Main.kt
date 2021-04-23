package core

class Man {
    var name: String
    var country: String

    constructor(name: String = "unknown", country: String = "unknown") {
        this.name = name
        this.country = name
    }
}


fun main() {
    val man1 = Man()
    //man1.name is "unknown"
    //man1.country is "unknown"

    val man2 = Man("Vladimir")
    //man2.name is "Vladimir"
    //man2.country is "unknown"

    val man3 = Man("Vladimir", "Brazil")
    //man3.name is "Vladimir"
    //man3.country is "Brazil"
}