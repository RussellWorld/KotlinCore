package core


fun main() {
    val tHtml = TextHtml()
    val text = tHtml.asText()
    //is "text"

    val html = tHtml.asHtml()

    println(text)
    println(html)
}

interface IText {
    fun asText(): String {
        return "text"
    }
}

interface IHtml {
    fun asHtml(): String {
        return "<span>html</span>"
    }
}

class TextHtml : IText, IHtml {}
