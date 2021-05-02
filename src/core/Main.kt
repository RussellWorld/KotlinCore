package core


fun main() {
    val car = Car()
    val v1 = TestCarVisitor()
    val v2 = RepairCarVisitor()

    car.accept(v1)
    car.accept(v2)
}

//Visitor
interface CarVisitor {
    fun visit(engine: Engine)
    fun visit(wheel: Wheel)
    fun visit(car: Car)
}

//ConcreteVisitor
class TestCarVisitor : CarVisitor {
    override fun visit(engine: Engine) {
        println("test engine")
    }

    override fun visit(wheel: Wheel) {
        println("test wheel #${wheel.getNumber()}")
    }

    override fun visit(car: Car) {
        println("test car")
    }
}

//ConcreteVisitor
class RepairCarVisitor : CarVisitor {
    override fun visit(engine: Engine) {
        println("repair engine")
    }

    override fun visit(wheel: Wheel) {
        println("repair wheel #${wheel.getNumber()}")
    }

    override fun visit(car: Car) {
        println("repair car")
    }

}

interface Element {
    fun accept(v: CarVisitor)
}

//ConcreteElement
class Engine : Element {
    override fun accept(v: CarVisitor) {
        v.visit(this)
    }
}

//ConcreteElement
class Wheel(private val number: Int) : Element {
    fun getNumber(): Int {
        return number
    }

    override fun accept(v: CarVisitor) {
        v.visit(this)
    }
}

//ConcreteElement
class Car : Element {
    private val items = arrayOf(Engine(), Wheel(1), Wheel(2),
            Wheel(3), Wheel(4))

    override fun accept(v: CarVisitor) {
        for (e in items) {
            e.accept(v)
        }
        v.visit(this)
    }
}