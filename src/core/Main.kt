package core


fun main() {
    val data = "Pi is equal to 3.14"
    val regex = "\\d+\\.\\d+".toRegex()
    val match = regex.find(data, 0)
    if (match != null) {
        var pi = match.value.toDouble()
        //pi is 3.14
        println(pi)
    }
}
