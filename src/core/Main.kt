package core

fun main() {
    val dic = hashMapOf<Int, String>()
    dic[1] = "one"
    dic[2] = "two"
    dic[3] = "three"
    //dic is 1="one" 2="two" 3=three

    dic.remove(3)
    //dic is 1=one, 2=two

    dic.clear()
    //dic is empty

}

