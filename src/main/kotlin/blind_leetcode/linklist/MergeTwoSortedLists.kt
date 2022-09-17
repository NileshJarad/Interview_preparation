package blind_leetcode.linklist

import common.LinkListUtils
import common.ListNode

/****
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * [https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=level-1]
 */

fun main() {
    var headFirst = LinkListUtils.createIntegerLinkList(intArrayOf(1, 2, 4))
    var headSecond = LinkListUtils.createIntegerLinkList(intArrayOf(1, 3, 4))
}

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        var newHead: ListNode? = null

        var list1Head = list1
        var list2Head = list2

        while (list1Head != null && list2Head != null) {
            var tempNode: ListNode?
            if (list1Head.`val` < list2Head.`val`) {
                tempNode = ListNode(list1Head.`val`)
//                tempNode =
            }
        }
        return newHead
    }
}