package core


fun main() {
    val process = { number: Int ->
        print(number * 10)
    }
    checkAndProcess(5, process)
    //printed: 50
}

fun checkAndProcess(number: Int, process: (Int) -> Unit) {
    if (number < 10) {
        process(number)
    }
}


