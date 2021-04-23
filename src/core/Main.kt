package core

import kotlin.math.pow

class PowerOfTwo {
    operator fun get(i: Int): Int {
        return 2.0.pow(i.toDouble()).toInt()
    }
}


fun main() {
    val power2 = PowerOfTwo()
    val p2 = power2[2]
    //p2 is 4
    val p8 = power2[8]
    //p8 is 256
    val p16 = power2[16]
    //p16 is 65546
    println("p2 = $p2, p8 = $p8, p16 = $p16")
}
