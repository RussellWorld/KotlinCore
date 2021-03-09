package core

fun main(args: Array<String>) {
    print(findString("Kotlin"))
}

fun findString(isNullString: String?): String {
    if (isNullString != null && isNullString.length > 0) {
        return "String of length ${isNullString.length}"
    } else {
        return "Empty or null string"
    }
}
