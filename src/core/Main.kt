package core

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val isContain2 = ContaintNumber(numbers, 2)
    //isContain2 is true

    val isContain4 = ContaintNumber(numbers, 4)
    //isContain4 is false

}

fun ContaintNumber(numbers: Array<Int>, number: Int): Boolean {
    for (currentNumber in numbers) {
        if (currentNumber == number)
            return true
    }
    return false
}

