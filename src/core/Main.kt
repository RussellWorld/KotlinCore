package core

fun main() {
    //Client
    val textMaker = TextMaker()

    val textBuilder = TextBuilder()
    textMaker.makeText(textBuilder)
    val text = textBuilder.getText()
    //text: Line1 Line2

    val htmlBuilder = HtmlBuilder()
    textMaker.makeText(htmlBuilder)
    val html = htmlBuilder.getHtml()
    //html: <span> line 1</span><br/> <span> line 2 </span>

    println(text)
    println(html)
}

//AbstractBuilder
interface ITextBuilder {
    fun addText(value: String)
    fun addNewLine(value: String)
}

//ConcreteBuilder 1
class TextBuilder : ITextBuilder {
    private var text = ""

    override fun addText(value: String) {
        text += value
    }

    override fun addNewLine(value: String) {
        text += "\n" + value
    }

    fun getText(): String {
        return text
    }
}

//ConcreteBuilder 2
class HtmlBuilder : ITextBuilder {
    private var html = ""
    override fun addText(value: String) {
        html += "<span>$value</span>"
    }

    override fun addNewLine(value: String) {
        html += "br/>\n"
        addText(value)
    }

    fun getHtml(): String {
        return html
    }
}

//Director
class TextMaker {
    fun makeText(textBuilder: ITextBuilder) {
        textBuilder.addText("Line 1")
        textBuilder.addNewLine("Line 1")
    }
}

