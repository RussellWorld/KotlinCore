package core


fun main() {
    val carType = Car::class

    val isAbstract = carType.isAbstract
    //isAbstract is False

    val isCompanion = carType.isCompanion
    //isCompanion is False

    val isData = carType.isData
    //isData is False

    val isFinal = carType.isFinal
    //is True

    val isOpen = carType.isOpen
    //is False

    val isSealed = carType.isSealed
    //is False

    println("TEST isAbstract: $isAbstract")
    println("TEST isCompanion: $isCompanion")
    println("TEST isData: $isData")
    println("TEST isFinal: $isFinal")
    println("TEST isOpen: $isOpen")
    println("TEST isSealed: $isSealed")
}

class Car