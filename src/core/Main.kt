package core

class Calc {
    companion object{
        fun getMin(vararg values: Int): Int{
            if (values.isEmpty())
                return 0
            var min = values[0]
            for (i in 1 until values.size){
                if (values[i] < min)
                    min = values[i]
            }
            return min
        }
    }
}


fun main() {
    val min = Calc.getMin(3, 2, 5, 1, 4).apply {
        println(this)
    }
    //min is 1
}