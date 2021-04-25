package core


import java.lang.Math.pow
import kotlin.math.*


fun main() {
    //Синус, косинус и тангенс
    val sin90 = sin(Math.PI / 2)
    //sin90 is 1.0

    val cos180 = cos(Math.PI)
    //cos is -1.0

    val tan45 = tan(Math.PI / 4)
    //tan45 is 0.9999999


    //мин и макс значения
    val minValue = min(min(2, 1), 3)
    //minValue is 1

    val maxValue = max(max(2, 1), 3)
    //maxValue is 3

    //логарифм
    val number = 512.0
    val logBase = 8.0
    val result = ln(number) / ln(logBase)
    //result is 3.0

    //квадратный корень
    val number1 = 100.0
    val result1 = sqrt(number)
    //result is 10.0

    //десятичный логарифм
    val number2 = 1000.0
    val result2 = log10(number)
    println("%.1f".format(result2))
    //result is 2.7

    //Возведение в степень
    val number4 = 8.0
    val power4 = 3.0
    val result4 = number.pow(power4)
    //result 512.0
}

