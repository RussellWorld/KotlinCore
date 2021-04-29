package core


fun main() {
    val data = """AaaA\r\naaaA"""
    val regex = "^(a+)".toRegex(
            setOf(RegexOption.IGNORE_CASE, RegexOption.MULTILINE))
    val value = regex.find(data, 0)!!.value
    //value is "AaaA"

    println(value)
}
