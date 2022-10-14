package practice.linklist

import common.LinkListUtils
import common.ListNode


fun main() {
    val head = LinkListUtils.createIntegerLinkList(intArrayOf(1, 2, 3, 4))
    println("Original list");
    LinkListUtils.traverseIntegerLinkList(head)
    val newHead = ReverseLinkList().reverse(head)
    println()
    println("Reverse list")
    newHead?.let {
        LinkListUtils.traverseIntegerLinkList(it)
    }
}

class ReverseLinkList {

    fun reverse(head: ListNode?): ListNode? {
        var next: ListNode? = null
        var prev: ListNode? = null

        var curr = head

        while (curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}