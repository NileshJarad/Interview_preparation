package ds.sliding_window

/***
 * Return max of sub array
 */
fun main() {
    val array = intArrayOf(1, 2, 3, 1, 4, 5, 2, 3, 6)
    val size = 3
    val maxOfSubArray = MaxOfSubArray()
    println("Max sub = ${maxOfSubArray.maxSumOfSubArray(array, size)}")
}


class MaxOfSubArray {
    fun maxSumOfSubArray(array: IntArray, size: Int): Int {
        var max = 0
        var sum = 0
        var start = 0
        var end = 0
        for ((index, value) in array.withIndex()) {
            if (end - start + 1 <= size) {
                sum += value
                end++
            } else {
                max = Math.max(max, sum)
                sum -= array[start]
                sum += array[end]
                start++
                end++
            }

        }

        return max
    }
}