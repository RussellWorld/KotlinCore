package core


fun main() {
    //Client
    val calc = Calc()
    val result1 = calc.execute(5, 3)
    //result1 is 0

    calc.setStrategy(AddStrategy())
    val result2 = calc.execute(5, 3)
    //result2 is 8

    calc.setStrategy(SubstractStrategy())
    val result3 = calc.execute(5, 3)
    //result3 is 2

    println(result1)
    println(result2)
    println(result3)
}

interface Strategy {
    fun doOperation(a: Int, b: Int): Int
}

//ConcreteStrategy
class AddStrategy : Strategy {
    override fun doOperation(a: Int, b: Int): Int {
        return a + b
    }
}

//ConcreteStrategy
class SubstractStrategy : Strategy {
    override fun doOperation(a: Int, b: Int): Int {
        return a - b
    }
}

//Context
class Calc {
    private var strategy: Strategy? = null

    fun execute(a: Int, b: Int): Int {
        if (strategy == null) {
            return 0
        }
        return strategy!!.doOperation(a, b)
    }

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }
}