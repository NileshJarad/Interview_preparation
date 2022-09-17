package common


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

object LinkListUtils {

    fun createIntegerLinkList(integers: IntArray): ListNode {
        val head = ListNode(integers[0])
        var current: ListNode = head
        for (index in 1 until integers.size) {
            val data = integers[index]
            val temp = ListNode(data)
            current.next = temp
            current = temp
        }
        return head
    }

    fun traverseIntegerLinkList(head: ListNode) {
        var traveller: ListNode? = head
        while (traveller != null) {
            print("  ${traveller.`val`}")
            traveller = traveller.next
        }
    }
}