package core


fun main() {
    val rows = arrayOf(2, 3, 5, 7, 11, 13, 17)
    //run ShowNumber for each number in numbers
    //using parallel computing
    rows.asList()
            .parallelStream()
            .forEach { i -> showNumber(i) }
    //prints random
}

fun showNumber(number: Int) {
    Thread.sleep(500)
    print("$number, ")
}