package core


fun main() {
    val rows = arrayOf<INamed>(
            Flower("Rose"),
            City("Rome"),
            Star("Sirius")
    )
    val list = rows.joinToString { it.name }
    //list is "Rose, Rome, Sirius"

    println(list)
}

interface INamed {
    val name: String
}

class Flower(override val name: String) : INamed

class City(override val name: String) : INamed

class Star(override val name: String) : INamed