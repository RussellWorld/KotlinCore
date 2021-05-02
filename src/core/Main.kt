package core


fun main() {
    //Client
    val observer1 = TextObserver("Observer #1")
    val observer2 = TextObserver("Observer #2")

    val textEdit = TextEdit()
    textEdit.attach(observer1)
    textEdit.attach(observer2)

    textEdit.setText("Test text")
    //printed: Obs #1 test text and #2
}

interface Observer {
    fun update(state: String)
}

//ConcreteObserver
class TextObserver(private val name: String) : Observer {
    override fun update(state: String) {
        println("$name: $state")
    }
}

//Subject
abstract class TestSubject() {
    private val observers = mutableListOf<Observer>()

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    fun notify(state: String) {
        for (observer in observers) {
            observer.update(state)
        }
    }
}

//ConcreteSubject
class TextEdit : TestSubject() {
    private var text = ""

    //SetState(state)
    fun setText(text: String) {
        this.text = text
        notify(text)
    }

    fun getText(): String {
        return text
    }
}