package core

import kotlin.reflect.KFunction


fun main() {
    val macType = MacBook::class

    //show constructors
    for (c in macType.constructors) {
        var info = c.name + "(" +
                getParameters(c) + ")"
        println(info)
    }
    //prints: <init>(model: kotlin.String, year: kotlin.Int)

}

class MacBook()

fun <T> getParameters(c: KFunction<T>): String {
    var s = ""
    for (param in c.parameters) {
        if (s.isNotEmpty()) s += ", "
        s += param.name + ": " + param.type.toString()
    }
    return s
}