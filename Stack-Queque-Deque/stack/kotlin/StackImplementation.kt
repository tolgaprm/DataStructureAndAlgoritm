fun main() {
    val myStack = MyStack<Int>()

    myStack.push(10)
    myStack.push(20)
    myStack.push(30)

    println(myStack.isEmpty())

    println(myStack.pop())
    println(myStack.size())
    println(myStack.pop())
    println(myStack.pop())
    println(myStack.isEmpty())
}

class MyStack<T> {
    private val elements = mutableListOf<T>()

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun push(element: T) {
        elements.add(element)
    }

    fun pop(): T {
        return elements.removeLast()
    }
    
    fun peek(): T {
        return elements.last()
    }
}
