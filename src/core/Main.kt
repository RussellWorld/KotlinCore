package core

fun main(args: Array<String>) {
    val arr = mutableListOf<Int>()
    arr.addAll(listOf(5, -25, -55, 25, 636, 23, 3262, 236, 243, 23, -1, -6))

    var temp = 0
    for (i in 0..arr.count() - 2) {
        for (j in 0..arr.count() - i - 2) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    arr.forEach { element ->
        print("$element ")
    }

}

