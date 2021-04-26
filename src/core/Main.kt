package core

import java.util.*
import java.util.concurrent.TimeUnit


fun main() {
    val cal = Calendar.getInstance()
    cal.set(1945, 4, 9, 0, 0, 0)
    val victoryDate = cal.time
    val now = Date()

    val days = getDateDiff(victoryDate, now, TimeUnit.DAYS)
    //days is 27746
    val minutes = getDateDiff(victoryDate, now, TimeUnit.MINUTES)
    //minutes is 37_054_603

    println(days)
    println(minutes)

}

fun getDateDiff(date1: Date, date2: Date, timeUnit: TimeUnit): Long {
    val diffInMillies = date2.time - date1.time
    return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS)
}
