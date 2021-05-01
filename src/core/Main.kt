package core


fun main() {
    //Client
    val mediator = SyncMediator()
    val switcher1 = Switcher(mediator)
    val switcher2 = Switcher(mediator)
    val switcher3 = Switcher(mediator)

    switcher1.setState(true)
    var state2 = switcher2.getState()
    //state2 is false
    var state3 = switcher3.getState()
    //state is false

    switcher1.sync()
    state2 = switcher2.getState()
    //state2 is true
    state3 = switcher3.getState()
    //state 3 is true

    println(state2)
    println(state3)
}

//Colleague
class Switcher {
    private var state = false
    private var mediator: Mediator

    constructor(mediator: Mediator) {
        this.mediator = mediator
        mediator.add(this)
    }

    fun sync() {
        mediator.sync(this)
    }

    fun getState(): Boolean {
        return state
    }

    fun setState(value: Boolean) {
        state = value
    }
}

abstract class Mediator {
    protected val switchers = mutableListOf<Switcher>()

    abstract fun sync(switcher: Switcher)

    fun add(switcher: Switcher) {
        switchers.add(switcher)
    }
}

//ConcreteMediator
class SyncMediator : Mediator() {
    override fun sync(switcher: Switcher) {
        val state = switcher.getState()
        for (curSwitcher in switchers) {
            curSwitcher.setState(state)
        }
    }
}