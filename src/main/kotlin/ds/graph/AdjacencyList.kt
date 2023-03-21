package ds.graph


const val TOTAL_VERTEX_ADJACENCY_LIST = 7

typealias GraphTypeAdjacencyList = Array<ArrayList<EdgeEntity>>

fun main() {
    val graph: Array<ArrayList<EdgeEntity>> = Array(TOTAL_VERTEX_ADJACENCY_LIST) {
        ArrayList<EdgeEntity>()
    }
    createAdjacencyList(graph)
    printNeighboursOf(2, graph)
    printNeighboursOf(1, graph)
}

fun printNeighboursOf(vertex: Int, graph: GraphTypeAdjacencyList) {
    print("Edges of $vertex = {")
    graph[vertex].forEach {
        print(" ${it.dest}")
    }
    println(" }")
}

fun createAdjacencyList(graph: GraphTypeAdjacencyList) {

    // edges of 0  = {1, 2}
    graph[0].add(EdgeEntity(0, 1))
    graph[0].add(EdgeEntity(0, 2))

    // edges of 1  = {3}
    graph[1].add(EdgeEntity(1, 0))
    graph[1].add(EdgeEntity(1, 3))

    // edges of 2  = {4}
    graph[2].add(EdgeEntity(2, 0))
    graph[2].add(EdgeEntity(2, 4))

    //edges of 3  = {1 4 5}
    graph[3].add(EdgeEntity(3, 1))
    graph[3].add(EdgeEntity(3, 4))
    graph[3].add(EdgeEntity(3, 5))

    graph[4].add(EdgeEntity(4, 2))
    graph[4].add(EdgeEntity(4, 3))
    graph[4].add(EdgeEntity(4, 5))

    graph[5].add(EdgeEntity(5, 3))
    graph[5].add(EdgeEntity(5, 4))
    graph[5].add(EdgeEntity(5, 6))

    graph[6].add(EdgeEntity(6, 5))
}