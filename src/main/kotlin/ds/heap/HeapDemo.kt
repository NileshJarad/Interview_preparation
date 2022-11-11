package ds.heap

import common.printArray
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max


fun main() {

//    val ipArray = intArrayOf(3,1,7,19,100,45,49)
    val ipArray = intArrayOf(50, 60, 70, 90, 80, 100, 20)
    val heapDemo = HeapDemo()
    heapDemo.buildMinHeap(ipArray)
    heapDemo.buildMaxHeap(ipArray)

    heapDemo.maxHeap(200)
    heapDemo.maxHeap.printArray()
    heapDemo.minHeap.printArray()

}

class HeapDemo {
    val maxHeap = ArrayList<Int>()
    val minHeap = ArrayList<Int>()

    fun buildMinHeap(ipArray: IntArray) {
        ipArray.forEach {
            minHeap(it)
        }
    }

    fun minHeap(it: Int) {
        minHeap.add(it)
        var index = minHeap.size - 1
        var parent = index / 2
        while (index >= 1 && minHeap[index] < minHeap[parent]) {
            Collections.swap(minHeap, index, parent)
            index = parent
            parent /= 2
        }
    }

    fun buildMaxHeap(ipArray: IntArray) {
        ipArray.forEach {
            maxHeap(it)
        }
    }

    fun maxHeap(it: Int) {
        maxHeap.add(it)
        var index = maxHeap.size - 1
        var parent = index / 2
        while (index >= 1 && maxHeap[index] > maxHeap[parent]) {
            Collections.swap(maxHeap, index, parent)
            index = parent
            parent /= 2
        }
    }
}


