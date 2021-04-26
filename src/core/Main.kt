package core


fun main() {
    var dataString = "Substring removing!"

    dataString = dataString.removeRange(9..17)
    //dataString is "Substring!"

    dataString = dataString.removePrefix("Sub")
    //dataString is "String"


}

