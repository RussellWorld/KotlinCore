package core

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main() {
    val pi = 3.1415
    var piRound = round(pi * 1000) / 1000.0
    //piRound is 3.142

    var piTrunc = floor(pi * 1000) / 1000
    //piTrunc is 3.141

    var piCeil = ceil(pi * 100) / 100
    //piCell is 3.15

    println(piCeil)

}

