package core

class Lesson {
    companion object {
        var lessonsCount = 0
    }

    init {
        lessonsCount++
    }
}

fun main() {
    val lessons1 = Lesson()
    //Lesson.lessonsCount is 1
    val lessons2 = Lesson()
    //Lesson.lessonsCount is 2
}
