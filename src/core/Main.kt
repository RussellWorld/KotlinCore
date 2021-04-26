package core


import java.util.*

fun main() {
    val now = Date()
    val cal = Calendar.getInstance()
    cal.add(Calendar.DAY_OF_YEAR, -1)
    val yesteday = cal.time

    val areEqual = now == yesteday
    //areEquale is False
    val areLater = now.after(yesteday)
    //areLater is True
    val areEarlier = now.compareTo(yesteday) < 0
    //areEarlier is False
}

