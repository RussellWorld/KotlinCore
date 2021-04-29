package core


fun main() {
    var data = "x77x6Fx72x6Cx64"
    val regex = "x([0-9A-F]{2})".toRegex()
    data = regex.replace(data) { result ->
        val b = result.groups[1]!!.value.toInt(16)
        b.toChar().toString()
    }
    //data is "world"
    println(data)
}
