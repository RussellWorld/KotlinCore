class SomeClass {
    val value = 46

    class NastedClass {
        fun showValue() {
            //Error: Unresolved reference: value
            // println("value - $value")
        }
    }

    inner class InnerClass {
        fun showValue() {
            println("value = $value")
        }
    }
}


fun main() {
    val someClass = SomeClass()
    someClass.InnerClass().showValue()
}