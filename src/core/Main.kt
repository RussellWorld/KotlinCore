package core


fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)

    val allLess10 = every(numbers, { x -> x < 10 })
    //True

    val someMore3 = some(numbers, { x -> x > 3 })
    //True

    val allOdd = every(numbers, { x -> x % 2 == 1 })
    //False

    println(allLess10)
    println(someMore3)
    println(allOdd)

}

fun <T> every(arr: Array<T>, f: (i: T) -> Boolean): Boolean {
    for (v in arr) {
        if (!f(v)) return false
    }
    return true
}

fun <T> some(arr: Array<T>, f: (i: T) -> Boolean): Boolean {
    for (v in arr) {
        if (!f(v)) return true
    }
    return false
}




