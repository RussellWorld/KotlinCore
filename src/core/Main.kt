package core
interface ITranslator {
    fun readMessage(message: String)
}
fun main(args: Array<String>){
    val robot = RobotTranslator()
    val key = enterMessage.randomKey()
    execute(enterMessage[key])
    val message = readLine()!!.toString().split(' ').joinToString(" ")
    do {
        print("enter the command : ")
        val (command) = readLine()!!.split(' ')
        if (robot.position == key) robot.readMessage(message)
        robot.setCommand(command)
    } while (command != "e")
}

val enterMessage = mapOf(
        EDirection.LEFT to {println("enter the message: ")},
        EDirection.CENTER to {print("enter the message:                      ")},
        EDirection.RIGHT to {print("enter the message:                                                           ")})

fun execute(func: (() -> Unit)?){
    if (func != null) {
        func()
    }
}

fun <E, V> Map<E, V>.randomKey(): E? = keys.toList()[Random().nextInt(size)]

enum class EDirection (val direction: String){
    LEFT("left"), RIGHT("right"), CENTER("center")
}
abstract class Robot {
    abstract var position: EDirection
    abstract fun move(direction: EDirection)
    abstract fun setCommand(command: String)
}
class RobotTranslator: Robot(), ITranslator {

    private val vocabulary = Vocabulary()

    override var position: EDirection = EDirection.LEFT
        set(value) {
            when(value){
                EDirection.LEFT -> leftView(message, translation)
                EDirection.CENTER -> centerView(message, translation)
                EDirection.RIGHT -> rightView(message, translation)
            }
            field = value
        }
    private var message: String = ""
    var translation: String = ""

    override fun readMessage(message: String) {
        this.message = message
    }

    private fun translate(message: String) {
        if (message != "") translation = vocabulary.getTranslation(message.split(" "))
        else translation = "don't see the message.. try to move me somewhere"
        when(position){
            EDirection.LEFT -> leftView(message, translation)
            EDirection.CENTER -> centerView(message, translation)
            EDirection.RIGHT -> rightView(message, translation)
        }
    }

    override fun move(direction: EDirection) {
        translation = ""
        position = direction
    }

    override fun setCommand(command: String) {
        val moveCommand = getMoveCommand(command)
        val currentCommand = getCommand(command)
        if (moveCommand != null) move(moveCommand)
        else if (currentCommand != null) translate(message)
        else println("invalid command")
    }

    private fun getMoveCommand(direction: String) = when (direction){
        EDirection.LEFT.direction -> EDirection.LEFT
        EDirection.CENTER.direction -> EDirection.CENTER
        EDirection.RIGHT.direction -> EDirection.RIGHT
        else -> null
    }

    private fun getCommand(direction: String) = when (direction){
        ECommand.TRANSLATE.command -> ECommand.TRANSLATE
        else -> null
    }

    enum class ECommand (val command: String){
        TRANSLATE("translate")
    }
}
fun leftView(message: String = "", translation: String = "") {
    println(message)
    println("  ___")
    println(" {*,*}")
    println("/|   |\\")
    println(" O---O")
    println(translation)
}

fun centerView(message: String = "", translation: String = "") {
    println("                                       $message")
    println("                                         ___")
    println("                                        {*,*}")
    println("                                       /|   |\\")
    println("                                        O---O")
    println("                                       $translation")
}

fun rightView(message: String = "", translation: String = "") {
    println("                                                                              $message")
    println("                                                                                ___")
    println("                                                                               {*,*}")
    println("                                                                              /|   |\\")
    println("                                                                               O---O")
    println("                                                                              $translation")
}
internal class Vocabulary {
    private val vocabularyMap = mapOf("hello" to "привет", "world" to "мир", "cat" to "кот")

    fun getTranslation(words: List<String>): String{
        val mutableCollection: MutableList<String> = arrayListOf("")
        words.forEachIndexed { index, s ->
            mutableCollection.add(vocabularyMap[s] ?: "")
        }
        return mutableCollection.joinToString(" ")
    }
}