package core


fun main() {
    val payFromWallet1 = makeWallet(arrayOf(1000))
    val payFromWallet2 = makeWallet(arrayOf(500))
    var balance = payFromWallet1(50)
    //balance is 950
    println(balance)

    balance = payFromWallet2(70)
    //balance is 430

    println(balance)

    balance = payFromWallet1(150)
    //balance is 800

    println(balance)
}

fun makeWallet(sum: Array<Int>): (Int) -> Int {
    return { pay: Int ->
        sum[0] -= pay
        sum[0]
    }
}




