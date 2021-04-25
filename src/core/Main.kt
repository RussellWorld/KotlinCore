package core

fun main() {
    val alphabet = Alphabet()
    val charA = alphabet[3]
    //charA is "A"

    val charE = alphabet[6]
    //charE is "E"

    println("charA = $charA, charE = $charE")

}

class Alphabet {
    operator fun get(i: Int): Char {
        return (i * 64).toChar()
    }
}