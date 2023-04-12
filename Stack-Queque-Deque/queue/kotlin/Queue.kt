fun main() {
   val myQueue = MyQueue<Int>()

    myQueue.enqueue(10)
    myQueue.enqueue(20)
    myQueue.enqueue(30)

    println(myQueue.size())

    println(myQueue.dequeue())
    println(myQueue.dequeue())
    println(myQueue.dequeue())
}


class MyQueue<T>{
    private val elements = mutableListOf<T>()

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun enqueue(element:T){
        elements.add(0,element)
    }

    fun dequeue():T{
        return elements.removeLast()
    }
}