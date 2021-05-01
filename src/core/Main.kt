package core


fun main() {
    //Client
    val bank = Bank()
    val cPut = PutCommand(bank)
    val cGet = GetCommand(bank)
    val client = BankClient(cPut, cGet)
    client.getMoney()
    //money to the client
    client.putMoney()
    //money from the client
}

interface Command {
    fun execute()
}

//Invoker
class BankClient(private val putCommand: Command, private val getCommand: Command) {
    fun putMoney() {
        putCommand.execute()
    }

    fun getMoney() {
        getCommand.execute()
    }
}

//Receiver
class Bank {
    fun giveMoney() {
        println("money to the client")
    }

    fun receiveMoney() {
        println("money from the client")
    }
}

//ConcreteCommand
class PutCommand(private val bank: Bank) : Command {
    override fun execute() {
        bank.receiveMoney()
    }
}

//ConcreteCommand
class GetCommand(private val bank: Bank) : Command {
    override fun execute() {
        bank.giveMoney()
    }

}