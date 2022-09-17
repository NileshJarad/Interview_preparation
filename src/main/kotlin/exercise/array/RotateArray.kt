package exercise.array

import common.printArray
import java.lang.RuntimeException

fun main() {
    val arrayToRotate = arrayOf(1, 4, 5, 6, 78, 8)
    arrayToRotate.printArray()

    print("\n Rotated array is \n")
    RotateArray().rotateArrayBy(arrayToRotate, 2)
}


class RotateArray {


    /***
     *
     * 1, 4, 5, 6, 78, 8
     *      As we are using two loops the time complexity for this function will be O(M * N) where M < N
     */


    @Throws(RuntimeException::class)
    fun rotateArrayBy(arrayToRotate: Array<Int>, rotateBy: Int) {
        if (arrayToRotate.size - 1 < rotateBy) {
            // some provides  rotate by value greater than actual array size
            throw RuntimeException("'rotateBy' can not be large than the array size")
        }

        for (n in 1..rotateBy) {
            var elementToMove = arrayToRotate.first()
            for (m in arrayToRotate.indices) {
                if (m == arrayToRotate.size - 1) {
                    arrayToRotate[0] = elementToMove
                } else {
                    val temp = arrayToRotate[m + 1]
                    if (elementToMove != Int.MIN_VALUE) {
                        arrayToRotate[m + 1] = elementToMove
                    }
                    elementToMove = temp

                }
            }
        }
    }
}

