package core


fun main() {
    val data = "Pi = 3.14, exponent = 2.718"
    val regex = "\\d+\\.\\d+".toRegex()
    val value = regex.findAll(data, 0)
    //values is ["3.14", "2.718"]

    value.forEach { print("${it.value}") }
}
