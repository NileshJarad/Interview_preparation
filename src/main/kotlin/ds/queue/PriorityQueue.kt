package ds.queue

import java.util.PriorityQueue

data class PriorityQueueClass(
    val id: Int = 0
) : Comparable<PriorityQueueClass>{
    override fun compareTo(other: PriorityQueueClass) = id - other.id
}


/***
 * Priority Queue uses max heap/ min heap depending on comparator or comparable
 * As heap is representation of Tree.
 * Max or min heap is balanced after top item is removed or new item is inserted
 */
fun main() {
    val pq = PriorityQueue<PriorityQueueClass>()
    pq.add(PriorityQueueClass(10))
    pq.add(PriorityQueueClass(1))
    pq.add(PriorityQueueClass(9))
    pq.add(PriorityQueueClass(3))
    pq.add(PriorityQueueClass(8))
    pq.add(PriorityQueueClass(1))
    println(pq)
    pq.remove()
    pq.remove()
    print(pq)

}