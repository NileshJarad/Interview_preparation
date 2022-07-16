import common.printArray

fun main() {
    // Unsorted array
    var unSortedArray = arrayOf(9, 5, 3, 8, 2, 6)
    // print the un sorted array

    unSortedArray.printArray()
    bubbleSort(unSortedArray)
    print("\nSorted array ")
    unSortedArray.printArray()
}

/**
 *
 * 9, 5, 3, 8, 2, 6
 *
 * Length = 6
 *
 * We need to start from first place as first element
 *
 * i = 1
 * ```
 *      j = 0
 * ```
 * 5, 9, 3, 8, 2, 6
 * ```
 *      j = 1
 *          5, 3, 9, 8, 2, 6
 *      j = 2
 *          5, 3, 8, 9, 2, 6
 *      j = 3
 *          5, 3, 8, 2, 9, 6
 *      j = 4
 *          5, 3, 8, 2, 6, 9
 * ```
 * At the first i th iteration largest element is moved to last position
 *
 * * i = 2
 * ```
 *      j = 0
 *          3, 5, 8, 2, 6, 9
 *      j = 1
 *          3, 5, 8, 2, 6, 9
 *      j = 2
 *          3, 5, 2, 8, 6, 9
 *      j = 3
 *          3, 5, 2, 6, 8, 9
 * ```
 * At the second i th iteration largest element is moved to second last position
 */
fun bubbleSort(unSortedArray: Array<Int>) {
    for (i in 1..unSortedArray.size - 1) {
        var swapped = false
        for (j in 0..unSortedArray.size - i - 1) {
            if (unSortedArray[j] > unSortedArray[j + 1]) {
                swapped = true
                var a = unSortedArray[j]
                unSortedArray[j] = unSortedArray[j + 1]
                unSortedArray[j + 1] = a
            }
        }
        if (swapped == false) {
            return
        }
    }
}
