package ds.sliding_window

fun main() {
    val intArray = intArrayOf(4, 1, 1, 1, 2, 3, 5)
    val longestSubArrayOfSum = LongestSubArrayOfSum()
    println(
        "Max Sub-Array of Size : ${
            longestSubArrayOfSum.getLongestSubArraySizeOfSum(intArray, 5)
        }"
    )


    val intArray2 = intArrayOf(-5, 8, -14, 2, 4, 12)
//    val intArray2 = intArrayOf(0, 3, 0 , 2, 6, 18)

    println(
        "Max Sub-Array of Size : ${
            longestSubArrayOfSum.getLongestSubArraySizeOfSum(intArray2, -12)
        }"
    )
}

class LongestSubArrayOfSum {
    fun getLongestSubArraySizeOfSum(intArray: IntArray, sum: Int): Int {
        var maxSize = 0
        val size = intArray.size
        var end = 0
        var start = 0
        var total = 0
        while (end < size && start <= end) {
            total += intArray[end]
            if (total == sum) {
                maxSize = maxOf(maxSize, end - start + 1)
            }
            while (total > sum) {
                total -= intArray[start]
                start++
            }
            end++
        }
        return maxSize
    }
}