class BaseBallProblem {
    // LeetCode problem of 682
    private val stack = Stack<Int>()
    private var totalSum = 0

    fun calPoints(operations: Array<String>): Int {
        operations.forEach { operation ->
            when (operation) {
                "C" -> {
                    stack.pop()
                }

                "D" -> {
                    stack.push(stack.peek() * 2)
                }

                "+" -> {
                    stack.push(stack.peek() + stack[stack.size - 2])
                }

                else -> {
                    stack.push(operation.toInt())
                }
            }
        }


        for (i in stack) {
            totalSum += i
        }

        return totalSum
    }
}