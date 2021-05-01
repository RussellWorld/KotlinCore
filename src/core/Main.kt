package core


fun main() {
//Client
    val ambulance = Ambulance(null)
    val police = Police(ambulance)
    val firefighter = Firefighter(police)
    firefighter.help(1)
    // call firefughters
    firefighter.help(2)
    //call police
    firefighter.help(3)
    //call ambulance
}

//Handler
abstract class Rescuer(protected val next: Rescuer?) {
    protected var code: Int = 0

    //HandleRequest()
    fun help(code: Int) {
        if (this.code == code) {
            toHelp()
        } else next?.help(code)
    }

    abstract fun toHelp()
}

//ConcreteHandler
class Firefighter(next: Rescuer?) : Rescuer(next) {
    init {
        this.code = 1
    }

    override fun toHelp() {
        println("call firefighters")
    }
}

//ConcreteHandler
class Police(next: Rescuer?) : Rescuer(next) {
    init {
        this.code = 2
    }

    override fun toHelp() {
        println("call the police")
    }
}

//ConcreteHandler
class Ambulance(next: Rescuer?) : Rescuer(next) {

    init {
        this.code = 3
    }

    override fun toHelp() {
        println("call an ambulance")
    }
}