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
class TextAdapter : IText {
    var rowList: StringList? = null

    override fun getText(): String {
        if (rowList == null) {
            return ""
        }
        return rowList!!.getString()
    }
}

fun getTextAdapter(): TextAdapter {

    val adapter = TextAdapter()
    val rowList = StringList()
    rowList.add("line 1")
    rowList.add("line 2")
    adapter.rowList = rowList
    return adapter
}