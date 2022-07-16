fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5, 6, 99, 102, 140)
    val indexFound = binarySearch(intArray, 99)
    if (indexFound != Int.MIN_VALUE) {
        print("Element found at $indexFound")
    } else {
        print("Element not found")
    }
}

/*

Element should be sorted

2^0 = 1

                            Iteration

N = N /2^0                  0

N/2 = N / 2^1               1

N/4 = N / 2^2               2

.
.
.
.
.

1 = N / 2^k                 k



We are doing the constant work in loop. But iteration value depends on the value of N


        N / 2^k = 1
        N = 2^k
        K = log N


Time complexity  of Binary search is  : O(log N)

*/

fun binarySearch(searchArray: Array<Int>, valueToSearch: Int): Int {
    var start: Int = 0
    var end = searchArray.size - 1
    while (start <= end) {
        var mid = (start + end) / 2
        if (valueToSearch == searchArray[mid]) {
            return mid
        } else if (valueToSearch < searchArray[mid]) {
            end = mid - 1
        } else if (valueToSearch > searchArray[mid]) {
            start = mid + 1
        }
    }
    return Int.MIN_VALUE
}
