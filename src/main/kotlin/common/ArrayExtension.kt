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

