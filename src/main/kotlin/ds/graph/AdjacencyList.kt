package ds.graph


const val TOTAL_VERTEX = 5

typealias GraphTypeAdjacencyList = Array<ArrayList<EdgeEntity>>

fun main() {
    val graph: Array<ArrayList<EdgeEntity>> = Array(TOTAL_VERTEX) {
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

    // edges of 0  = {2}
    graph[0].add(EdgeEntity(0, 2))

    // edges of 1  = {2,3}
    graph[1].add(EdgeEntity(1, 2))
    graph[1].add(EdgeEntity(1, 3))

    // edges of 2  = {0,1,3}
    graph[2].add(EdgeEntity(2, 0))
    graph[2].add(EdgeEntity(2, 1))
    graph[2].add(EdgeEntity(2, 3))

    //edges of 3  = {1,2}
    graph[3].add(EdgeEntity(3, 1))
    graph[3].add(EdgeEntity(3, 2))
}