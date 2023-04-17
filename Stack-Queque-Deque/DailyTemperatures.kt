class DailyTemperatures {
    //  LeetCode problem of 739
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = Stack<List<Int>>()
        val result = MutableList(temperatures.size ) { 0 }

        temperatures.forEachIndexed { index, temperature ->
            while (stack.isNotEmpty() && temperature > stack.peek()[0]) {
                val (stackTemp, stackIndex) = stack.pop()
                result[stackIndex] = index - stackIndex
            }
            stack.push(listOf(temperature, index))
        }
        return result.toIntArray()
    }
}