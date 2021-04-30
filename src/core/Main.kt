package core

fun main() {

    //Client
    val settings = Settings.getInstance()
    // val settings = Settings()  //<- Error

    settings.host = "192.168.100.1"
    settings.port = 33

    val settings1 = Settings.getInstance()
}

    //Singleton
class Settings private constructor() {
    companion object {
        private var instance: Settings? = null

        fun getInstance(): Settings {
            if (instance == null) {
                instance = Settings()
            }
            return instance!!
        }
    }

    var port = 0
    var host = ""
}

