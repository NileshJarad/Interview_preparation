package practice.array

import common.printArray


/***
 * Examples 1:
 * Input: matrix=[
 *                  [1,1,1]
 *                  [1,0,1]
 *                  [1,1,1]
 *               ]
 * Output: [
 *              [1,0,1]
 *              [0,0,0]
 *              [1,0,1]
 *         ]
 *
 * Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
 *
 * Input: matrix=[
 *                  [0,1,2,0]
 *                  [3,4,5,2]
 *                  [1,3,1,5]
 *               ]
 * Output:[
 *              [0,0,0,0]
 *              [0,4,5,0]
 *              [0,3,1,0]
 *        ]
 * Explanation:Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
 *
 */
fun main() {

    val arr = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(3, 6, 0),
        intArrayOf(3, 4, 8),
    )

    println("Input array is :")
    arr.printArray()
    val matrixOutput = SetMatrixZero().markMatrix(arr)
    println()
    println("Output array is :")
    matrixOutput.printArray()
}

class SetMatrixZero {

    fun markMatrix(arrInput: Array<IntArray>): Array<IntArray> {

        val row = arrInput.size
        val col = arrInput[0].size
//        val arrOutput = Array(size) { IntArray(size) }

        val arrayRow = IntArray(row) { -1 }
        val arrayCol = IntArray(col) { -1 }
        for (i in 0 until row) {
            for (j in 0 until col) {
                if (arrInput[i][j] == 0) {
                    arrayRow[i] = 0
                    arrayCol[j] = 0
                }
            }
        }

        for (i in 0 until row) {
            for (j in 0 until col) {
                if (arrayRow[i] == 0 || arrayCol[j] == 0) {
                    arrInput[i][j] = 0
                }
            }
        }

        return arrInput
    }
}