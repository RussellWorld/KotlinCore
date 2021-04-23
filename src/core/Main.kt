package core

class Counter {
    var count = 0
    fun incBy(value: Int) {
        count += value
    }

    fun incBy(value: Int, amount: Int) {
        count += value * amount
    }
}


fun main() {
    val counter = Counter()
    counter.incBy(1)
    counter.incBy(2, 5)

    println(counter.count)
}