package practice.linklist

import common.LinkListUtils
import common.ListNode

/***
 * Given the heads of two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 */


fun main() {
    val l1 = LinkListUtils.createIntegerLinkList(intArrayOf(9, 9, 9, 9, 9, 9, 9))
    LinkListUtils.traverseIntegerLinkList(l1)
    println()
    val l2 = LinkListUtils.createIntegerLinkList(intArrayOf(9, 9, 9, 9))
    LinkListUtils.traverseIntegerLinkList(l2)
    println()
    AddTwoNumbers().add(l1, l2)?.let { LinkListUtils.traverseIntegerLinkList(it) }
}

class AddTwoNumbers {
    fun add(l1Head: ListNode?, l2Head: ListNode?): ListNode? {
        var l1Node = l1Head
        var l2Node = l2Head
        var carry = 0
        val newHead = ListNode(-1)
        var temp = newHead
        while (l1Node != null || l2Node != null || carry == 1) { // carry == 1 is added when last carry 1 is remaining
            var addition = 0
            if (l1Node != null) {
                addition += l1Node.`val`
                l1Node = l1Node.next
            }
            if (l2Node != null) {
                addition += l2Node.`val`
                l2Node = l2Node.next
            }
            addition += carry
            carry = addition / 10
            val newNode = ListNode(addition % 10)
            temp.next = newNode
            temp = temp.next!!
        }
        return newHead.next
    }
}