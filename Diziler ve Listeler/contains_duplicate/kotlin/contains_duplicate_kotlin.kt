class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numsSet = mutableSetOf<Int>()
        for (i in nums) {
            numsSet.add(i)
        }
        return numsSet.size < nums.size
    }
}