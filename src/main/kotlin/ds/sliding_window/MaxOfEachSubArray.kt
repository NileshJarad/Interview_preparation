package ds.sliding_window

import common.printArray


fun main() {
    val array = intArrayOf(1, 2, 3, 1, 4, 5, 2, 3, 6)
    val size = 3
    val maxOfEachSubArray = MaxOfEachSubArray()
    maxOfEachSubArray.maxOfEachSubArray(array, size).printArray() // 3	 3	 4	 5	 5	 5	 6

    val array2 = intArrayOf(1, 3, -1, 5, 3, 6, 7)
    val size2 = 3
    maxOfEachSubArray.maxOfEachSubArray(array2, size2).printArray() // 3	 5	 5	 6	 7
}

class MaxOfEachSubArray {
    fun maxOfEachSubArray(intArray: IntArray, window: Int): Array<Int> {
        val size = intArray.size - window + 1
        val maxOfArrays = Array(size) { _ -> 0 }
        var start = 0
        var end = 0
        var max = 0
        for (value in intArray) {

            // move window
            if (end - start + 1 < window) {
                max = maxOf(max, value)
                end++
            } else if (end - start + 1 == window && start < end && end < intArray.size) {
                // do calculation
                max = maxOf(max, value)

                maxOfArrays[start] = max

                // increment the index for window
                start++
                end++
            }
        }
        return maxOfArrays
    }
}