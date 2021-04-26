package core


import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main() {
    val now = LocalDateTime.now()

    var df = DateTimeFormatter.ofPattern("M/dd/YY h:mm a")
    val shortStyle = now.format(df)
    //shortStyle is "2/21/21 3:57 PM"

    df = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val customStyle = df.format(now)
    //customStyle is 2021-02-21
}

