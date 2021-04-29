package core

import java.time.Year
import kotlin.reflect.full.createInstance


fun main() {
    val macType = MacBook::class

    //show superTypes
    for (member in macType.supertypes) {
        println("TEST supertype: $member")
    }
}

interface NoteBook {
    fun description(): String

}

class MacBook(var model: String, var year: Int) : NoteBook {
    override fun description(): String {
        return "model: $model, year: $year"
    }

}