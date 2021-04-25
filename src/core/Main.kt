package core

fun main() {
    val avg = GetAvg(1.0, 2.0, 3.0, 4.0)
    //avg is 2.5

    println(avg)
}

fun GetAvg(vararg values: Double): Double {
    if (values.isEmpty()) {            //values.size == 0
        return 0.0
    }
    var sum = 0.0
    for (value in values) {
        sum += value
    }
    return sum / values.size
}