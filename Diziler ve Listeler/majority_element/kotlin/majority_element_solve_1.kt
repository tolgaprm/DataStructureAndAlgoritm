fun majorityElement(nums: IntArray): Int {
    var hashMap : HashMap<Int, Int> = HashMap<Int, Int> ()
    for(num in nums){
        val current = hashMap.get(num) ?: 0
        hashMap.put(num,current+1)
        if((current+1)>nums.size/2) return num
    }
    return 0
}