package core


import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main() {
    val stringDate = "1945-05-09 01:00"

    val df = DateTimeFormatter.ofPattern(
            "yyyy-MM-dd HH:mm"
    )
    val victoryDate = LocalDateTime.parse(stringDate, df)
}

