package core

fun main() {

}

interface ICar {
    fun StartEngine(): Boolean
    fun StopEngine()
}

class SportCar : ICar {
    private var started: Boolean = false
    override fun StartEngine(): Boolean {
        if (started)
            return false
        started = true
        return true
    }

    override fun StopEngine() {
        started = false
    }

}

