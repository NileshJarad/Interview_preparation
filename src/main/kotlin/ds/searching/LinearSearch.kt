fun main() {
    val intArr = arrayOf(1, 3, 4, 44, 55, 61, 75, 6, 7, 8, 99)

    val indexFound = linearSearch(intArr, 7)
    if (indexFound != Int.MIN_VALUE) {
        print("Element found at $indexFound")
    } else {
        print("Element not found")
    }
}

/*

In This algorithm number of instruction is directly proprional to the number of elements in array

Linear search will take O(N) as in worst case we have to travel full list/ array
*/

fun linearSearch(searchArray: Array<Int>, valueToSearch: Int): Int {
    for (index in searchArray.indices) {
        if (valueToSearch == searchArray[index]) {
            return index
        }
    }
    return Int.MIN_VALUE
}
