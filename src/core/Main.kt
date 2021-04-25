package core

import java.text.DecimalFormat


fun main() {
    val exp = 2.798798797

    val s1 = exp.toString()
    println(s1)
    //s1 is 2.798798797

    val s2 = "%.3f".format(exp)
    println(s2)
    //s2 is 2.799

    val s3 = "%2.2e".format(exp / 100)
    println(s3)
    //s3 is 2.80e-02

    val df = DecimalFormat("#,###.00")
    var symbols = df.decimalFormatSymbols
    symbols.groupingSeparator = ' '
    df.decimalFormatSymbols = symbols
    val s4 = df.format(exp * 1_000_000)
    println(s4)
    //s4 is 2 798 798.797


}

