package core


fun main() {
    val numbers = arrayOf("one", "two", "three")
    val numberList = numbers.joinToString { "; " }
    //nuberList is "one; two; three"
}

