package core


fun main() {
    //Client
    val con = Connection()

    //open the connection
    con.open()
    //connection is already open
    con.open()
    //close the connection
    con.close()
    //connection is already closed
    con.close()
}

interface State {
    fun open(c: core.Connection)
    fun close(c: Connection)
}

//ConcreteState
class CloseState : State {
    override fun open(c: core.Connection) {
        println("open the connection")
        c.setState(OpenState())
    }

    override fun close(c: Connection) {
        println("connection is already closed")
    }
}

//ConcreteState
class OpenState : State {
    override fun open(c: core.Connection) {
        println("connection is already open")
    }

    override fun close(c: Connection) {
        println("close the connection")
        c.setState(CloseState())
    }
}

//Context
class Connection {
    private var state: State = CloseState()

    fun open() {
        state.open(this)
    }

    fun close() {
        state.close(this)
    }

    fun setState(state: State) {
        this.state = state
    }
}