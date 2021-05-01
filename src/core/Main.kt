package core


fun main() {
    //Client
    val numbers = PrimeNumbers()
    val iterator = numbers.getIterator()
    var sum = 0
    iterator.first()
    while (!iterator.isDone()) {
        sum += iterator.currentItem()
        iterator.next()
    }

    //sum is 28
    println(sum)
}

//Iterator
interface IntIterator {
    fun first()
    fun next()
    fun isDone(): Boolean
    fun currentItem(): Int
}

//Aggregate
interface IntAggregate {
    fun getIterator(): IntIterator
}

//ConcreteAggregate
class PrimeNumbers : IntAggregate {
    private val numbers = arrayOf(2, 3, 5, 7, 11)
    override fun getIterator(): IntIterator {
        return Iterator()
    }

    //ConcreteIterator
    inner class Iterator : IntIterator {
        private var index = 0
        override fun first() {
            index = 0
        }

        override fun next() {
            index++
        }

        override fun isDone(): Boolean {
            return index >= numbers.size
        }

        override fun currentItem(): Int {
            return numbers[index]
        }

    }

}