package core

fun main() {
    val sizeName = Size.Small.sizeName
    println(sizeName)
}

enum class Size{
    Small("S"), Middle("M"), Large("L");

    var sizeName = ""
    constructor(name: String){
        sizeName = name
    }
}