package core

fun main(args: Array<String>) {
    print(checkNumbers(5,10))

}
fun checkNumbers(a: Int, b: Int): Char {
    if (a < b)
        return ('<')
    else if (a > b)
        return ('>')
    else
        return ('=')
}