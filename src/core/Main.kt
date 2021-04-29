package core

import kotlin.math.pow

fun main() {
    //explicitly specify return type
    val powOfTwo = { power: Int ->
        2.0.pow(power.toDouble())
    }
    val powe8 = powOfTwo(8)
    //pow is 256.0

    //implicitly specified return type
    val powOfThree: (Double) -> Double = { power ->
        3.0.pow(power)
    }
    val pow3 = powOfThree(3.0)
    //pow3 is 27.0
}

