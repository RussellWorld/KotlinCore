package core


fun main() {
    val strData = "1981|Kim Victoriya|engineer"
    val arrData = strData.split("|")

    val year = arrData[0].toInt()
    //year is 1981

    val name = arrData[1]
    //name is Kim Victoriya

    val position = arrData[2]
    //position is engeneer

    println("$year $name $position")

}

