package core

fun main() {

    println(describe(42))

}

class Tiger {}

fun describe(obj: Any): String =
        when (obj) {
            2 -> "two"
            is Tiger -> "Tiger!"
            "Error" -> "Error String"
            is Int -> "Int type"
            !is String -> "Not a string"
            else -> "Unknown type"
        }

