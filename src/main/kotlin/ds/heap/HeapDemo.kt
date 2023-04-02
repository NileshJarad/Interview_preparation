package ds.heap

import common.printArray
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max


fun main() {

//    val ipArray = intArrayOf(3,1,7,19,100,45,49)
    val ipArray = intArrayOf(50, 60, 10, 70, 90, 80, 100, 20)
    val heapDemo = HeapDemo()
    heapDemo.buildMinHeap(ipArray)
    heapDemo.buildMaxHeap(ipArray)

    heapDemo.maxHeap(200)
    heapDemo.maxHeap.printArray()
    heapDemo.minHeap.printArray()

    heapDemo.removeMinFromMinHeap()
}

class HeapDemo {
    val maxHeap = ArrayList<Int>()
    val minHeap = ArrayList<Int>()

    fun removeMinFromMinHeap() {
        val lastPosition = minHeap.size - 1
        Collections.swap(minHeap, 0, lastPosition) // O(1)
        minHeap.removeAt(lastPosition) // O(1)
        minHeap.printArray()
        print("\nMin Heap")
        minHeapify(0)
        minHeap.printArray()
    }

    private fun minHeapify(index: Int) {
        /***
         * If heap is zero index based then use
         *      val left = index * 2 + 1
         *      val right = index * 2 + 2
         *  Or else if heap is 1 index base use
         *      val left = 2*i;
         *      val right = 2*i + 1;
         */

        val left = index * 2 + 1
        val right = index * 2 + 2
        val currentValue = minHeap[index]

        /**
         * left < minHeap.size - 1 is necessary because it ensure index will not
         * go beyond the size og the heap
         */
        val minIndex = if (left < minHeap.size - 1 && minHeap[left] < currentValue) {
            left
        } else if (right < minHeap.size - 1 && minHeap[right] < currentValue) {
            right
        } else {
            index
        }
        if (minIndex != index) {
            Collections.swap(minHeap, index, minIndex)
            minHeapify(minIndex)
        }
    }

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


