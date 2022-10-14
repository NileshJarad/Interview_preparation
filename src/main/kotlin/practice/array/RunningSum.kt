package practice.array

import common.printArray

fun main() {
    RunningSum().runningSum(intArrayOf(1,7,3,6,5,6)).printArray()
}

class RunningSum {
    fun runningSum(nums: IntArray): IntArray {
        for (index in 1 until nums.size) {
            nums[index] = nums[index - 1] + nums[index]
        }
        return nums
    }
}