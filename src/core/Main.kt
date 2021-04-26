package core

import java.util.*


fun main() {
    val stringStack = Stack<String>()
    stringStack.push("one")
    stringStack.push("two")

    val employeeQueue = LinkedList<Employee>()
    employeeQueue.add(Employee("Anton", "Pavlov"))

    println(stringStack[0])
    println(employeeQueue[0])
}

class Employee(var firstName: String, var LastName: String)


