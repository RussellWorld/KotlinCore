package core

import java.lang.Math.pow
import kotlin.math.pow


fun main() {
    val power = PowerOfTwo()
    val p8 = power[8]
    //is 256

    val p16 = power[16]
    //is65636

    println(p8)
    println(p16)
}

interface IntIndex {
    operator fun get(i: Int): Int
}

class PowerOfTwo : IntIndex {
    override fun get(i: Int): Int {
        return 2.0.pow(i.toDouble()).toInt()
    }

}



