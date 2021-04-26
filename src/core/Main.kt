package core


fun main() {
    var str = "1-/[=2=/]-3"
    val separators = "[=/\\[]|]"
    str = str.replace(
            separators.toRegex(), ""
    )
    //str is 1-2-3
    println(str)
}

