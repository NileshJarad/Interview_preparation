package common



fun ArrayList<Int>.printArray() {
    print("\n In Print ArrayList function\n")
    for (i in this.indices) {
        print("\t ${this[i]}")
    }
}

