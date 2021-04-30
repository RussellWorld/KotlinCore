package core

fun main() {
    testFactory(Factory1())
    //printed: test A1 and test B1
    testFactory(Factory2())
    //printed: test A2 and test B2
}

//client code
fun testFactory(factory: IFactory) {
    val productA = factory.createA()
    val productB = factory.createB()
    productA.testA()
    productB.testB()
}

//concrete product A1
class ProductA1 : IProductA {
    override fun testA() {
        println("test A1")
    }
}

//concrete product A2
class ProductA2 : IProductA {
    override fun testA() {
        println("test A2")
    }
}

//concrete product B1
class ProductB1 : IProductB {
    override fun testB() {
        println("test B1")
    }
}

//concrete product B2
class ProductB2 : IProductB {
    override fun testB() {
        println("test B2")
    }
}

//concrete factory 1
class Factory1 : IFactory {
    override fun createA(): IProductA {
        return ProductA1()
    }

    override fun createB(): IProductB {
        return ProductB1()
    }
}

//concrete factory 2
class Factory2 : IFactory {
    override fun createA(): IProductA {
        return ProductA2()
    }

    override fun createB(): IProductB {
        return ProductB2()
    }
}

//abstract factory
interface IFactory {
    fun createA(): IProductA
    fun createB(): IProductB
}


//abstact product B
interface IProductB {
    fun testB()
}

//Abstract product A
interface IProductA {
    fun testA()
}
