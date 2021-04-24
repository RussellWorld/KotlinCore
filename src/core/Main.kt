package core

import core.IShape as IShape1


interface IShape {
    var lineCount: Int
    fun getArea(): Int
}

class Square : IShape1 {
    override var lineCount: Int
    var sideLenght: Int

    constructor(sideLenght: Int) {
        this.sideLenght = sideLenght
        this.lineCount = 4
    }

    override fun getArea(): Int {
        return sideLenght * sideLenght
    }
}


fun main() {
    var square = Square(5)
    var area = square.getArea()
    //area is 25
}
