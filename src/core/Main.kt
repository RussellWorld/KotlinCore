package core

import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.declaredMemberProperties


fun main() {
    val macType = MacBook::class

    //show Methods
    for (member in macType.declaredFunctions) {
        println("fun : ${member.name}")
    }

    for (member in macType.declaredMemberProperties)
        println("prop : ${member.name}")
}

class MacBook(var model: String, var year: Int) {
    fun description(): String {
        return "model: $model, year: $year"
    }
}