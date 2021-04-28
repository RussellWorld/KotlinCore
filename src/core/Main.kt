package core


fun main() {
    val intList = mutableListOf<Int>()
    intList.add(5)

    //Dictionary
    val dic = hashMapOf<Int, String>()
    dic[1] = "one"  //dic.put(1, "one")

    //Set
    val set = mutableSetOf<Double>()
    set.add(3.14)

    println(intList[0])
    println(dic[1])
    println(set.contains(3.14))

}

