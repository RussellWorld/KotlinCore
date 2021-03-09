package core

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter the number of elements in the array: ")
    var n = reader.nextInt()

    var arrAdd = mutableListOf<Int>()
    for (i in 0..n) {
        print("Enter index [$i] = ")
        arrAdd.add(reader.nextInt())
    }
    arrAdd.forEach { i ->
        print(i)
    }

}

