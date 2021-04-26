package core

import java.time.LocalDate
import java.time.LocalDateTime

fun main() {
    val now = LocalDate.now()
    val time = LocalDateTime.now()
    val year = now.year
    val month = now.month
    val day = now.dayOfMonth
    val hour = time.hour
    val minute = time.minute
    val second = time.second
    val dayOfWeek = now.dayOfWeek.value
}

