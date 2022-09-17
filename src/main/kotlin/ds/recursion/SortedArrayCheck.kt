package ds.recursion

import common.printArray


fun main() {
    val a1 = intArrayOf(1,2,3,4)
    a1.printArray()
    print(" sorted ? = ${SortedArrayCheck().check(a1,0)}")

    val a2 = intArrayOf(1,2,5,3,4)
    a2.printArray()
    print(" sorted ? = ${SortedArrayCheck().check(a2,0)}")

    val a3 = intArrayOf()
    a3.printArray()
    print(" sorted ? = ${SortedArrayCheck().check(a3,0)}")


    val a4 = intArrayOf(1)
    a4.printArray()
    print(" sorted ? = ${SortedArrayCheck().check(a4,0)}")
}

class SortedArrayCheck {
    fun check(intArray: IntArray, currIndex: Int) : Boolean {
        if (currIndex > intArray.size - 2) {
            return true
        }
        if(intArray[currIndex] < intArray[currIndex+1] && check(intArray,currIndex+1)){
            return true
        }
        return false
    }
}