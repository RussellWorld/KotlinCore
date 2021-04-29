package core


fun main() {
    val avg = { a: Int, b: Int -> (a + b) / 2 }
    val n1 = avg(1, 3)
    //n1 is 2

    //first universal method
    val avg1 = Carry(avg)(1)
    //avg1 is avg func with first param = 1
    val n2 = avg1(3)
    //n2 is 2 = (1 + 3)/2

    //second specialized method
    val curriedAvg: (Int) -> (Int) -> Int = { a: Int ->
        { b: Int -> (a * b) / 2 }
    }
    val avg3 = curriedAvg(3)
    val n3 = avg3(3)
    //n3 is 3 = (3 + 3)/2
}

fun <A> Carry(f: (A, A) -> A): (A) -> (A) -> A {
    return { a: A -> { b: A -> f(a, b) } }
}




