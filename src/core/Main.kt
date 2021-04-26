package core

fun main() {
    var sum10 = 0
    for (i in 1..10) {
        sum10 += i
    }
    // sum is 55

    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }
    //prints: 10 8 6 4 2
}

