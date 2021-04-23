package core

class Greeting {
    companion object {
        fun sayGoodby(message: String = "Goodby!") {
            println(message)
        }

        fun sayHello(message: String = "Hello!") {
            println(message)
        }
    }
}


fun main() {
    Greeting.sayGoodby()
    //print "Goodby"
    Greeting.sayHello("Hi")
    //print "Hi"
}
