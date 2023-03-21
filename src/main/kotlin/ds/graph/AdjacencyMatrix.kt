package ds.graph


typealias GraphTypeAdjacencyMatrix = Array<ArrayList<Int>>

fun main() {
    val graph: Array<Array<Int>> = Array(TOTAL_VERTEX) {
        Array(TOTAL_VERTEX) {
            0
        }
    }
}

fun createAdjacencyMatrix(graph: GraphTypeAdjacencyMatrix) {
    // edges of 0  = {2}
    // edges of 1  = {2,3}
    // edges of 2  = {0,1,3}
    // edges of 3  = {1,2}

    graph[0][2] = 1

    graph[1][2] = 1
    graph[1][3] = 1

    graph[2][0] = 1
    graph[2][1] = 1
    graph[2][3] = 1

    graph[3][1] = 1
    graph[3][2] = 1
}