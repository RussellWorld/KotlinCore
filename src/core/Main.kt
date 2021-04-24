package core

fun main() {
    val statistic = Statistic()
    val heroes = Game("Heroes")
    val doom = Game("Doom")

    //subscribe to events
    heroes.addListener(statistic)
    doom.addListener(statistic)

    doom.start()
    heroes.start()
    //statistic.lastGame is "Heroes"
    //statistic.startsCount is 2

    println(statistic.lastGame)
    println(statistic.startsCount)

}


//In Kotlin there are no events type
interface GameListener{
    fun gameStarted(name: String)
}

class Game(private val name: String){
    private val listeners = arrayListOf<GameListener>()
    fun addListener(listener: GameListener){
        listeners.add(listener)
    }
    fun start(){
        for (listener in listeners) {
            listener.gameStarted(name)
        }
    }
}
class Statistic: GameListener{
    var startsCount = 0
    var lastGame = ""

    override fun gameStarted(name: String) {
        startsCount++
        lastGame = name
    }
}

