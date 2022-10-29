package practice.array

import common.printArray


fun main() {
    PascalArray().create(6)
}

class PascalArray {
    fun create(n: Int) {
        val pascalArray = Array(n) { IntArray(n) { 0 } }
        for (i in pascalArray.indices) {
            for (j in pascalArray.indices) {
                if (i == j || j == 0) {
                    pascalArray[i][j] = 1
                }
                if (i > 1 && j > 0) {
                    pascalArray[i][j] = pascalArray[i - 1][j - 1] + pascalArray[i - 1][j]
                }
            }
        }
        pascalArray.printArray()
    }
}