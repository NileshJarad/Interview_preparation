package ds.sliding_window

import common.printArray

/***
 * Return max of sub array
 */
fun main() {
    val array = intArrayOf(1, 2, 3, 1, 4, 5, 2, 3, 6)
    val size = 3
    val individualSumOfSubArray = IndividualSumOfSubArray()
    individualSumOfSubArray.sumEachSubArray(array, size).printArray()
}

class IndividualSumOfSubArray {
    fun sumEachSubArray(array: IntArray, size: Int): Array<Int> {
        val size1 = array.size - size + 1
        val maxSubArray = Array(size1) { _ -> 0 }
        var sum = 0
        var start = 0
        var end = 0
        for (value in array) {
            if (end - start + 1 <= size) {
                sum += value
                end++
            } else {
                maxSubArray[start] = sum
                sum -= array[start]
                sum += array[end]
                start++
                end++
            }
            maxSubArray[start] = sum

        }

        return maxSubArray
    }
}