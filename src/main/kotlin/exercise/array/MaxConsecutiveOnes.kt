package exercise.array

import kotlin.math.max


fun main() {
//    val result = Solution().findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1))
    val result = MaxConsecutiveOnes().findMaxConsecutiveOnes(intArrayOf(1, 1, 1, 1, 1,0, 1,0,1,1,1,1,1,1,1,1))
    print(result)
}


class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var currentLength = 0
        for (num in nums) {
            if (num == 1) {
                currentLength++
                max = max(max,currentLength)
            } else {
                currentLength = 0
            }
        }
        return max
    }
}