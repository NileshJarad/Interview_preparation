package blind_leetcode.linklist

import common.LinkListUtils
import common.ListNode

/**
 * Time complexity is O(N)
 * Space complexity is O(1)
 */
fun main() {
    val head = LinkListUtils.createIntegerLinkList(intArrayOf(1, 2, 3, 4))
    LinkListUtils.traverseIntegerLinkList(head)
    println()
//    println(MiddleOfLinkList().middleNode(head)?.`val`) // 1, 2, 3, 4, 6  middle is 3
//    println(MiddleOfLinkList().middleNode(head)?.`val`) // 1, 2, 3, 4, 6, 5  middle is 4
    println(MiddleOfLinkList().middleNode(head)?.`val`) // 1, 2, 3, 4  middle is 3
}

class MiddleOfLinkList {
    fun middleNode(head: ListNode?): ListNode? {
        var slowPointer: ListNode? = head
        var fastPointer: ListNode? = head
        while (fastPointer?.next != null) {
            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next
        }
        return slowPointer
    }
}