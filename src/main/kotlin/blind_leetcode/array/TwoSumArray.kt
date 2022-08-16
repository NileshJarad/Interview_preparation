package blind_leetcode.array

import common.printArray
import printArray


/***
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
 *
 */


fun main() {
    val result = TwoSumArray().twoSumUsingHashMap(intArrayOf(-2, 2, 7, 11, 15), 9)
    result.printArray()
}

class TwoSumArray {
    /**
     * In this method we do sorting of array which takes O(N log N)
     * Then we traverse array using the two index to find number which take O(N)
     */
    fun twoSumUsingSortArray(nums: IntArray, target: Int): Array<Int> {
        return Array(2) { i -> 0 }
    }

    fun twoSumUsingHashMap(nums: IntArray, target: Int): Array<Int> {
        val map: HashMap<Int, Int> = HashMap()
        val result = Array(2) { i -> 0 }
        for ((index, value) in nums.withIndex()) {
            map[value] = index
            val diff = target - value
            if (map.contains(diff)) {
                result[0] = map[diff]!!
                result[1] = index
                return result
            }

        }
        return result
    }

}