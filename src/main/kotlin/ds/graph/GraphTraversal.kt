package ds.graph

import java.util.LinkedList
import java.util.Queue

/***
 * BFS (Breadth first search)
 *  - Go to immediate neighbours first
 *  - Then go to neighbours of neighbours
 *  - In-direct Level order traversal from tree traversal
 *  - Take Queue data structure
 *      - Print current node
 *      - Mark current node as visited
 *      - visit  neighbours of current node
 *
 * DFS (Depth first search)
 *  - Keep going to first neighbour and it's neighbours recursively
 *  - Then go to the first neighbour
 *
 */

fun main() {
    val graph: Array<ArrayList<EdgeEntity>> = Array(TOTAL_VERTEX_ADJACENCY_LIST) {
        ArrayList<EdgeEntity>()
    }
    createAdjacencyList(graph)
    bfsOfGraph(graph)
    println()
    recursiveBfsOfGraph(graph, LinkedList<Int>().apply { add(0) }, Array(TOTAL_VERTEX_ADJACENCY_LIST) { false })
}

fun bfsOfGraph(graph: GraphTypeAdjacencyList) {
    val queue: Queue<Int> = LinkedList<Int>()
    val visited: Array<Boolean> = Array(TOTAL_VERTEX_ADJACENCY_LIST) { false }
    queue.add(0)
    while (queue.isNotEmpty()) {
        val curr = queue.poll()
        if (!visited[curr]) {
            print("$curr ")
            visited[curr] = true
            graph[curr].forEach {
                queue.add(it.dest)
            }
        }
    }
}

fun recursiveBfsOfGraph(graph: GraphTypeAdjacencyList, queue: LinkedList<Int>, visited: Array<Boolean>) {
    if (queue.isEmpty()) {
        return
    }
    val curr = queue.poll()
    if (!visited[curr]) {
        print("$curr ")
        visited[curr] = true
        graph[curr].forEach {
            queue.add(it.dest)
        }
    }
    recursiveBfsOfGraph(graph, queue, visited)
}