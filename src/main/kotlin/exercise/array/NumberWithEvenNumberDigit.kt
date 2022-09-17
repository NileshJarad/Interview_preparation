package exercise.array


fun main() {
    /**
     *
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits
     */
    println(NumberWithEvenNumberDigit().findNumbers(intArrayOf(12, 345, 2, 6, 7896)))
    println(NumberWithEvenNumberDigit().findNumbersString(intArrayOf(555, 901, 482, 1771)))
}

class NumberWithEvenNumberDigit {
    private fun getDigits(n: Int): Int {
        if (n / 10 == 0)
            return 1;
        return 1 + getDigits(n / 10);
    }

    fun findNumbers(nums: IntArray): Int {
        var evenNumber = 0
        for (num in nums) {
            if (getDigits(num) % 2 == 0) {
                evenNumber++
            }
        }
        return evenNumber
    }

    fun findNumbersString(nums: IntArray): Int {
        var evenNumber = 0
        for (num in nums) {
            if ("$num".length % 2 == 0) {
                evenNumber++
            }
        }
        return evenNumber
    }
}