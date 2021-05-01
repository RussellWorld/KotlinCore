package core


fun main() {
    //Client
    val adapter = getTextAdapter()
    val text = adapter.getText()
    //text: line 1 and line 2

    println(text)
}

//Target
interface IText {
    //Request()
    fun getText(): String
}

//Adaptee
open class StringList {
    private val rows = mutableListOf<String>()

    //SpecificRequest()
    fun getString(): String {
        return rows.joinToString("\n")
    }

    fun add(value: String) {
        rows.add(value)
    }
}

//Adapter
class TextAdapter : StringList(), IText {
    override fun getText(): String {
        return getString()
    }
}

fun getTextAdapter(): TextAdapter {
    val adapter = TextAdapter()
    adapter.add("line 1")
    adapter.add("line 2")
    return adapter
}