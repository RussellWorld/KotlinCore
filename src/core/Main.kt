package core

fun main() {
    Setting.mode = 3
    Setting.setNextMode()
}

class Setting {
    companion object {
        //type property
        var path = ""
        var mode: Int = 0

        //type method
        fun setNextMode() {
            mode = (mode + 1) % 3
        }
    }
}