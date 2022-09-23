package ds.tree.binary_search_tree

import common.printArray
import java.util.LinkedList
import java.util.Stack


fun main() {
    val root = BinarySearchTree(4)
    root.buildBst(intArrayOf(8, 15, 21, 3, 7, 2, 5, 10, 6, 11))
    root.visit().printArray()

    println("In order :")
    root.inOrderTraversal()
    println()

    println("Iterative In Order :")
    root.iterativeInOrderTraversal(root)
    println()

    println("Pre order :")
    root.preOrderTraversal()
    println()

    println("Iterative Pre Order :")
    root.iterativePreOrderTraversal(root)
    println()

    println("Post order :")
    root.postOrderTraversal()
    println()

    println("Level order :")
    root.levelOrder()
    println()
}

class BinarySearchTree(
    private var data: Int,
    private var leftNode: BinarySearchTree? = null,
    private var rightNode: BinarySearchTree? = null
) {
    fun buildBst(values: IntArray) {
        values.forEach { valToInsert ->
            insert(valToInsert)
        }
    }

    private fun insert(value: Int) {
        if (value > this.data) {
            if (this.rightNode == null) {
                this.rightNode = BinarySearchTree(value)
            } else {
                this.rightNode?.insert(value)
            }
        } else if (value < this.data) {
            if (this.leftNode == null) {
                this.leftNode = BinarySearchTree(value)
            } else {
                this.leftNode?.insert(value)
            }
        }
    }

    fun inOrderTraversal() {
        this.leftNode?.inOrderTraversal()
        print("$data - ")
        this.rightNode?.inOrderTraversal()
    }

    fun preOrderTraversal() {
        print("$data - ")
        this.leftNode?.preOrderTraversal()
        this.rightNode?.preOrderTraversal()
    }

    fun iterativePreOrderTraversal(root: BinarySearchTree) {
        val stack = Stack<BinarySearchTree>()
        stack.push(root)

        while (!stack.isEmpty()) {
            val node = stack.pop()
            print("${node.data} - ")

            if (node.rightNode != null) {
                stack.push(node.rightNode)
            }

            if (node.leftNode != null) {
                stack.push(node.leftNode)
            }
        }
    }


    fun iterativeInOrderTraversal(root: BinarySearchTree) {
        val stack = Stack<BinarySearchTree>()

        var currNode: BinarySearchTree? = root
        while (!stack.isEmpty() || currNode != null) {
            if (currNode != null) {
                stack.push(currNode.leftNode)
                currNode = currNode.leftNode
            }else{
                currNode = stack.pop()
                print("${currNode?.data}")
                currNode = currNode?.rightNode
            }
        }
    }

    fun postOrderTraversal() {
        this.leftNode?.postOrderTraversal()
        this.rightNode?.postOrderTraversal()
        print("$data - ")
    }

    fun iterativePostOrderTraversal(root: BinarySearchTree) {
        val stack = Stack<BinarySearchTree>()

        var currNode: BinarySearchTree? = root
        while (!stack.isEmpty() || currNode != null) {
            if (currNode != null) {
                stack.push(currNode.leftNode)
                currNode = currNode.leftNode
            }else{
                currNode = stack.pop()
                currNode = currNode?.rightNode
            }
        }
    }

    fun levelOrder() {
        val queue = LinkedList<BinarySearchTree>()
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

    fun visit(): Array<Int> {
        val a = leftNode?.visit() ?: emptyArray()
        val b = rightNode?.visit() ?: emptyArray()
        return a + arrayOf(data) + b
    }
}
