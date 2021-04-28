package core


fun main() {

    val rose = Flower("Rose")
    val isPID = rose is IUID // <- Error
    //Incompatible types IUID and Flower

    var isNamed = rose is INamed
    //isNamed is true

    val pName = rose as INamed
    val name = pName.getName()
    //name is "Rose

}

interface IUID {
    fun getId(): Int
}

interface INamed {
    fun getName(): String
}

class Flower(private var name: String) : INamed {
    override fun getName(): String {
        return name
    }
}
