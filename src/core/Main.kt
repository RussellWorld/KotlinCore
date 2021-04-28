package core

import kotlin.math.pow

fun main() {
    val calc = Calc()
    val value = calc.power(2.0, 8.0)
    //value 256
    println(value)
}

interface ICalc {
    fun addition(a: Int, b: Int): Int
}

class Calc : ICalc {
    override fun addition(a: Int, b: Int): Int {
        return a + b
    }
}

fun ICalc.power(a: Double, b: Double): Double {
    return a.pow(b)
}