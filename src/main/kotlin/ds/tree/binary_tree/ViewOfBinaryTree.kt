package ds.tree.binary_tree

import java.util.*
import kotlin.collections.ArrayList


fun main() {
    // create binary tree
    val root = BinaryTreeNode(1)
    root.leftNode = BinaryTreeNode(2)
    root.rightNode = BinaryTreeNode(3)
    root.leftNode?.leftNode = BinaryTreeNode(4)
    root.rightNode?.leftNode = BinaryTreeNode(5)
    root.rightNode?.rightNode = BinaryTreeNode(6)
    root.rightNode?.leftNode?.leftNode = BinaryTreeNode(7)
    root.rightNode?.leftNode?.rightNode = BinaryTreeNode(8)


//    println()
//    root.preOrderTraversal()
//    println()
//    root.postOrderTraversal()
    println()
    TopViewOfBinaryTree().topViewOfTree(root)
    println()
    TopViewOfBinaryTree().bottomViewOfTree(root)
    println()
    TopViewOfBinaryTree().rightSideView(root).forEach {
        print("$it -")
    }
}

typealias  level = Int
typealias  value = Int


class TopViewOfBinaryTree {
    fun topViewOfTree(root: BinaryTreeNode) {

        val queue = LinkedList<Pair<BinaryTreeNode, level>>()
        val map = TreeMap<level, value>()
        queue.add(Pair(root, 0))
        while (queue.isNotEmpty()) {
            val (poppedNode, poppedLevel) = queue.pop()

            if (map[poppedLevel] == null) {
                map[poppedLevel] = poppedNode.data
            }

            if (poppedNode.leftNode != null) {
                queue.add(Pair(poppedNode.leftNode!!, poppedLevel - 1))
            }

            if (poppedNode.rightNode != null) {
                queue.add(Pair(poppedNode.rightNode!!, poppedLevel + 1))
            }
        }

        map.forEach { (_, value) ->
            print("$value -")
        }

    }

    fun bottomViewOfTree(root: BinaryTreeNode) {
        val queue = LinkedList<Pair<BinaryTreeNode, level>>()
        val map = TreeMap<level, value>()
        queue.add(Pair(root, 0))
        while (queue.isNotEmpty()) {
            val (poppedNode, poppedLevel) = queue.pop()

            map[poppedLevel] = poppedNode.data

            if (poppedNode.leftNode != null) {
                queue.add(Pair(poppedNode.leftNode!!, poppedLevel - 1))
            }

            if (poppedNode.rightNode != null) {
                queue.add(Pair(poppedNode.rightNode!!, poppedLevel + 1))
            }
        }
        map.forEach { (_, value) ->
            print("$value -")
        }

    }

    fun rightSideView(root: BinaryTreeNode): List<Int> {
        val result = ArrayList<Int>()
        rightView(root, result, 0);
        return result;
    }

    private fun rightView(curr: BinaryTreeNode?, result: ArrayList<Int>, currDepth: Int) {
        if (curr == null) {
            return
        }
        if (currDepth == result.size) {
            result.add(curr.data)
        }

        rightView(curr.rightNode, result, currDepth + 1)
        rightView(curr.leftNode, result, currDepth + 1)

    }

}

/**
 * What is reason to use TreeMap
 *
 * 1) TreeMap offers O(log N) lookup and insertion
 * 2) Keys are ordered
 * 3) It cannot have null key but can have multiple null values.
 * 4) It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key).
 */