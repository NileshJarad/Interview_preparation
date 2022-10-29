package practice.recursion


fun main() {
    println("Sum of Array : ${SumArray().calculateSum(intArrayOf(1, 2, 3, 4, 5), 0)}")
}

class SumArray {
    fun calculateSum(arr: IntArray, startFrom: Int): Int {
        if (arr.size <= startFrom) {
            return 0
        }
        return arr[startFrom] + calculateSum(arr, startFrom + 1)
    }
}