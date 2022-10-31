package practice.string

/**
 * 1) Do not use the built-in #reverse() method
 * 2) Ideal solution would run in O(n) time complexity and O(1) space complexity
 *
 *
 * Can we try with stack ?
 */
fun main() {

    val useTwoPointer : String = ReverseString().useTwoPointer("This".toCharArray())
    print("Reverse of This =  $useTwoPointer")

}

class ReverseString {
    fun useTwoPointer(charArray: CharArray): String {
        var startIndex = 0;
        var endIndex = charArray.size - 1
        while (startIndex <= endIndex) {
            val tempVal = charArray[startIndex];
            charArray[startIndex] = charArray[endIndex]
            charArray[endIndex] = tempVal
            startIndex++
            endIndex--
        }
        return String(charArray)
    }
}