package core


fun main() {
    var primeNumbers = mutableListOf(2, 5, 7)

    primeNumbers.add(11)
    //2,5,7,11
    primeNumbers.add(1, 3)
    //2,3,5,7,11
    primeNumbers.removeAt(2)
    //2,3,7,11
    primeNumbers.addAll(arrayOf(13, 17))
    //2,3,7,11,13,17
    primeNumbers.clear()
    //empty []

}

