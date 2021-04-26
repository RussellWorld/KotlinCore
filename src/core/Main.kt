package core


fun main() {
    val str = "ABC"
    val charA = str[0]

    val charB = str[1]

    val charC = str[2]

    var charList = ""
    for (c in str){
        charList += c + "; "
    }
    println(charList)
}

