package core

import java.util.*


fun main() {
    val cal = Calendar.getInstance()
    cal.set(1945, 5, 9, 0, 0, 0)
    val victoryDate = cal.time

    println(victoryDate)

}

