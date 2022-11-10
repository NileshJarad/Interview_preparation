package ds.sliding_window

import common.printArray
import java.util.LinkedList
import java.util.Queue

fun main() {
    val array = intArrayOf(-8, 2, 3, -6, 10)
    val size = 2
    val array2 = intArrayOf(12, -1, -7, 8, -15, 30, 16, 28)
    val size2 = 3
    val firstNegativeInSubArrays = FirstNegativeInSubArrays()
    firstNegativeInSubArrays.printFirstNegative(array, size).printArray()
    firstNegativeInSubArrays.printFirstNegative(array2, size2).printArray()
}

class FirstNegativeInSubArrays {

    fun printFirstNegative(intArray: IntArray, window: Int): Array<Int> {
        val size = intArray.size - window + 1
        val negativeArray = Array(size) { _ -> 0 }
        var start = 0
        var end = 0
        val queue: Queue<Int> = LinkedList()


        while (end - start + 1 < window) {
            if (intArray[end] < 0) {
                queue.add(intArray[end])
            }
            end++
        }
        for (value in intArray) {
            if (end - start + 1 < window) {
                if (value < 0) {
                    queue.add(value)
                }
                end++
            } else if (end - start + 1 == window && start < end && end < intArray.size) {
                if (intArray[end] < 0) {
                    queue.add(intArray[end])
                }
                if (queue.isNotEmpty()) {
                    negativeArray[start] = queue.peek()
                } else {
                    negativeArray[start] = 0
                }
                if (queue.isNotEmpty() && queue.first() == intArray[start]) {
                    queue.poll()
                }
                start++
                end++
            }
        }
//        if (queue.isNotEmpty()) {
//            negativeArray[start] = queue.poll()
//        }
        return negativeArray
    }
}