package core

fun main() {
    var latitude = 0
    var location: String

    if (latitude == 0)
        location = "Equator"
    else if (latitude == 90)
        location = "north Pole"
    else if (latitude == -90)
        location = "south Pole"
    else
        location = "not at the Equator or Pole"
}

