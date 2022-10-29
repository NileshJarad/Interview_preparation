package practice.linklist

import common.LinkListUtils
import common.ListNode

/**
Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list instead, you will be given access to the node to be deleted directly. It is guaranteed that the node to be deleted is not a tail node in the list.
 */
fun main() {


    val node5 = ListNode(5)
    val node4 = ListNode(4)
    val node3 = ListNode(3)
    val node2 = ListNode(2)
    val head = ListNode(1)
    head.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    LinkListUtils.traverseIntegerLinkList(head)
    println()
    RemoveNodeInO1().delete(node4)
    LinkListUtils.traverseIntegerLinkList(head)
}

class RemoveNodeInO1 {

    fun delete(node: ListNode?) {
        if (node != null) {
            node.`val` = node.next?.`val` ?: 0
            node.next = node.next?.next
        }
    }
}