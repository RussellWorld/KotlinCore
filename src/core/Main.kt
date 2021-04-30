package core

fun main() {
    //Client
    val factory = CharFactory()
    val charA = factory.getChar('A')
    charA.printSpan("font-size: 12")

    val charB = factory.getChar('B')
    charB.printSpan("font-size: 12")

    val charA1 = factory.getChar('A')
    charA1.printSpan("font-size: 12")

    val equal = charA == charA1
    //equal is True

    println(equal)
}

//Flyweight
interface ISpan {
    fun printSpan(style: String)
}

//ConcreteFlyweight
class FChar(protected var c: Char) : ISpan {
    override fun printSpan(style: String) {
        //Operation(extrinsicState)
        println("<span style=\"$style\" $c</span>")
    }
}

//FlyweightFactory
class CharFactory {
    var chars = hashMapOf<Char, FChar>()

    //GetFlyweight(key)
    fun getChar(c: Char): ISpan {
        var character = chars[c]
        if (character == null) {
            character = FChar(c)
            chars[c] = character
        }
        return character
    }
}