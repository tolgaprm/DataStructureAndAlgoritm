fun main() {
    val myDeque = MyDeque<Int>()

    myDeque.addRight(10)

    myDeque.addRight(20)

    // [10,20]

    myDeque.addLeft(30)

    // [30,10,20]

    myDeque.addLeft(40)

    // [40,30,10,20]

    myDeque.addRight(50)

    // [40,30,10,20,50]

    myDeque.size()

    println(myDeque.removeLeft())

    println(myDeque.removeLeft())

    println(myDeque.removeRight())

    println(myDeque.size())
}


class MyDeque<T> {
    private val elements = mutableListOf<T>()

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun addLeft(element: T) {
        elements.add(0, element)
    }

    fun removeLeft(): T {
        return elements.removeAt(0)
    }

    fun addRight(element: T) {
        elements.add(element)
    }

    fun removeRight(): T {
        return elements.removeLast()
    }

}