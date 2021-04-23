package core

class Calc {
    companion object {
        fun getSum(n1: Int, n2: Int): Int {
            return n1 + n2
        }
    }
}


fun main() {
    val sum = Calc.getSum(5, 3)
//sum is 8
    println("sum = $sum")
}
