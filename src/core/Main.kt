package core

fun main(args: Array<String>) {
    println(isLatter('f'))
    println(isLatter('1'))
    println(checkNumber('5'))
}

fun isLatter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun checkNumber(c: Char) = c !in '0'..'9'


