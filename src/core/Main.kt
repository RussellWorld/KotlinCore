package core

fun main() {
    //Client
    val textMaker = FillTextBuilder(TextBuilder())
    val text = textMaker.getText()
    //test: Line 1 and Line 2

    val htmlMaker = FillTextBuilder(HtmlBuilder())
    val html = htmlMaker.getText()

    println(text)
    println(html)
}

//Abstraction
interface IText {
    //Operations
    fun getText(): String
    fun addLine(value: String)
}


//Implementator
abstract class TextImp {
    var rows = mutableListOf<String>()

    fun getString(): String {
        return rows.joinToString ("\n" )
    }

    abstract fun appendLine(value: String)
}

//RefinedAbstractions
class TextMaker(var textImp: TextImp) : IText {
    override fun getText(): String {
        return textImp.getString()
    }

    override fun addLine(value: String) {
        textImp.appendLine(value)
    }
}


//ConcreteImplementator
class TextBuilder : TextImp() {
    override fun appendLine(value: String) {
        rows.add(value)
    }
}

//ConcreteImplementator
class HtmlBuilder : TextImp() {
    override fun appendLine(value: String) {
        rows.add("<span>$value<\\span><br\\>")
    }
}

fun FillTextBuilder(textImp: TextImp): TextMaker {
    val textMaker = TextMaker(textImp)
    textMaker.addLine("line 1")
    textMaker.addLine("line 2")
    return textMaker
}