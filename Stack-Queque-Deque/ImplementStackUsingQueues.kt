class MyStack() {
    private val queue: Queue<Int> = LinkedList<Int>()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop(): Int {
        var returnedValue: Int? = null
        for (i in 0 until queue.size) {
            if (i != queue.size - 1) {
                queue.add(queue.poll())
            } else {
                returnedValue = queue.poll()
            }
        }
        return returnedValue ?: 0
    }

    fun top(): Int {
        return queue.last()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}
