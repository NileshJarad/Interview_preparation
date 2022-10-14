package ds.tree.binary_tree

import java.util.Hashtable
import java.util.Vector


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


    val t = ArrayList<Int>()
}

class BinaryTreeExample {
}