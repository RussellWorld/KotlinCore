package core


fun main() {
    var startString = "3, 2, 1, go!"
    startString = startString
            .replace("1", "one")
            .replace("2", "two")
            .replace("3", "three")
    //startString = "three, two, one, go!"

    //replace all
    var oneString = "1 1 1"
    oneString = oneString
            .replace("1", "one")

    println("$startString   $oneString")
    //oneString is "one one one"
}

