package core


fun main() {
    var data = "Pi = 3.14, exponent = 2.718"
    val regex = """\d+\.\d+""".toRegex()
    data = regex.replace(data, "<f>$0</f>")

    //data is "Pi = <f>3.14</f>, exponent = <f>2.718</f>"

    println(data)
}
