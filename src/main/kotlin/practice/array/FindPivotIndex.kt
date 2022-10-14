package practice.array


fun main() {
//    print("Index  is ${FindPivotIndex().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))}") // Answer is index 3
//    print("Index  is ${FindPivotIndex().pivotIndex(intArrayOf(1,2,3))}") // Answer is index -1
    print("Index  is ${FindPivotIndex().pivotIndex(intArrayOf(2,1,-1))}") // Answer is index 0
}

class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        val runningSumAll = Array(nums.size) { i -> 0 }
        runningSumAll[0] = nums[0]
        for (index in 1 until nums.size) {
            runningSumAll[index] = runningSumAll[index - 1] + nums[index]
        }
        for (index in nums.indices) {
            if (index == 0) {
                if((runningSumAll[nums.size - 1] == nums[index])) {
                    return 0

                }
            } else if (runningSumAll[index - 1] == runningSumAll[nums.size - 1] - runningSumAll[index - 1] - nums[index]) {
                return index
            }
        }
        return -1
    }
}