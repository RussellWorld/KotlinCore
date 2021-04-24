package core

fun main() {
    val connection1 = Config.getConnection()
    //connection is "10.0.0.1:52"

    Config.host = "10.0.0.3"
    val connection2 = Config.getConnection()
    //connection is "10.0.0.3:52"
}

class Config {
    companion object {
        //type constant
        val maxConnections = 3

        //type fields
        var host = ""
        var port = 52

        //type method
        fun getConnection(): String {
            return "$host:$port"
        }

        //type constructor
        init {
            host = "10.0.0.1"
        }
    }
}