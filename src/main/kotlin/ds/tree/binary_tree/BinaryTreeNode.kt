package ds.tree.binary_tree

import ds.tree.binary_search_tree.BinarySearchTree
import java.util.*

class BinaryTreeNode(
    var data: Int,
    var leftNode: BinaryTreeNode? = null,
    var rightNode: BinaryTreeNode? = null
)

fun BinaryTreeNode.levelOrder() {
    val queue = LinkedList<BinaryTreeNode>()
    queue.push(this)
    while (!queue.isEmpty()) {
        val pop = queue.pop()
        print("${pop?.data} - ")
        if (pop.leftNode != null) {
            queue.add(pop.leftNode!!)
        }
        if (pop.rightNode != null) {
            queue.add(pop.rightNode!!)
        }
    }
}

fun BinaryTreeNode.postOrderTraversal() {
    this.leftNode?.postOrderTraversal()
    this.rightNode?.postOrderTraversal()
    print("$data - ")
}

fun BinaryTreeNode.inOrderTraversal() {
    this.leftNode?.inOrderTraversal()
    print("$data - ")
    this.rightNode?.inOrderTraversal()
}

fun BinaryTreeNode.preOrderTraversal() {
    print("$data - ")
    this.leftNode?.preOrderTraversal()
    this.rightNode?.preOrderTraversal()
}
