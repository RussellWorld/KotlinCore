package core

class Man {
    var id = 0

    companion object {
        var nextId: Int

        init {
            nextId = getLastDbid()
        }

        fun getLastDbid(): Int {
            //some implementation
            return 0
        }
    }

    init {
        nextId++
        id = nextId
    }
}


fun main() {
    val man = Man()
    //man.id is 1
}