package core


fun main() {
    var dataString = StringBuilder("string")

    dataString = dataString.insert(0, "Sub")
    //dataString is "Substring"

    dataString = dataString.append("!")
    //dataString is "Substring!"

    dataString = dataString.insert(9, " inserting")
    //dataString is "Substring inserting!"
}

