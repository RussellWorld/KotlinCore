package core

fun main() {
//Client
    val proxy = ImageProxy("1.png")
    //operation without creating a RealSubject
    val fileName = proxy.getGFileName()
    //forwarded
    proxy.draw()
}

//Subject
abstract class Graphic(protected var fileName: String) {
    abstract fun draw()

    fun getGFileName(): String {
        return fileName
    }
}

//RealSubject
class Image(fileName: String) : Graphic(fileName) {
    override fun draw() {
        println("draw $fileName")
    }
}

//Proxy
class ImageProxy(fileName: String) : Graphic(fileName) {
    private var image: Image? = null
    private fun getImage(): Image {
        if (image == null) {
            image = Image(fileName)
        }
        return image!!
    }

    override fun draw() {
        getImage().draw()
    }
}