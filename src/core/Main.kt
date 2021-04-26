package core

import java.lang.Exception

fun main() {
   throwIfTrue(true)
    //printed: "catch" and "finally"
    throwIfTrue(false)

}

fun throwIfTrue(param: Boolean){
    try {
        if (param){
            throw Exception("test exception")
        }
    }
    catch (e: Exception){
        println("catch")
    }
    finally {
        println("finally")
    }
}

