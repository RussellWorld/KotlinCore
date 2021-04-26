package core

import java.time.LocalDateTime
import java.util.*


fun main() {
    //example with LocalDate
    val now = LocalDateTime.now()
    val yesterday = now.minusDays(1)
    val tomorrow = now.plusDays(1)
    val nextMonth = now.plusMonths(1)
    val nextYear = now.plusYears(1)

    //example with Date
    val cal = Calendar.getInstance()
    cal.add(Calendar.DAY_OF_YEAR, -1)
    val yeasterday1 = cal.time

    cal.add(Calendar.DATE, 1)
    val tomorrow1 = cal.time

    cal.add(Calendar.MONTH, 1)
    val nextMonth1 = cal.time

    cal.add(Calendar.YEAR, 1)
    val nextYear1 = cal.time


}

