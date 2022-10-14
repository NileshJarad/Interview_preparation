package common

fun Array<Int>.printArray() {
    print("\n In Print Array function\n")
    for (i in this.indices) {
        print("\t ${this[i]}")
    }
}

fun IntArray.printArray() {
    print("\n In Print Array function\n")
    for (i in this.indices) {
        print("\t ${this[i]}")
    }
}


fun Array<IntArray>.printArray() {
    print("\n In Print Array function\n")
    val row = this.size
    val col = this[0].size
    for (i in 0 until row) {
        for (j in 0 until col) {
            print("\t ${this[i][j]}")
        }
        println()
    }
}

