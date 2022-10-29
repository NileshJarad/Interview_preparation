package practice.recursion


fun main() {
    println("Item in Array : ${ItemInArray().count(intArrayOf(1, 2, 3, 10, 4, 5), 0)}")
}

class ItemInArray {
    fun count(arr: IntArray, startFrom: Int): Int {
        if (arr.size <= startFrom) {
            return 0
        }
        return 1 + count(arr, startFrom + 1)
    }
}