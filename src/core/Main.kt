package core

fun main() {
//Client
    val image = Image()
    image.add(Circle())
    image.add(Square())
    val picture = Image()
    picture.add(image)
    picture.add(Image())
    picture.draw()
}

//Component
interface Graphic {
    fun draw()
}

//Leaf
class Circle : Graphic {
    override fun draw() {
        println("Draw circle")
    }
}

//Leaf
class Square : Graphic {
    override fun draw() {
        println("Draw square")
    }
}

//Composite
class Image : Graphic {
    val graphics = mutableListOf<Graphic>()

    fun add(graphic: Graphic) {
        graphics.add(graphic)
    }

    fun remove(graphic: Graphic): Boolean {
        return graphics.remove(graphic)
    }

    override fun draw() {
        for (graphic in graphics)
            graphic.draw()
    }
}

