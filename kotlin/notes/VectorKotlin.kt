import java.util.Vector

/**
 * Vector is is dynamic array All element are in contiguous memory with adavantage of change of size
 *
 * When vector runs out of space while addindg element then it doubles the size
 *
 * In kotlin vector are passed by value.
 */
fun main() {
    val vector = Vector<String>()

    vector.addElement("1")
    vector.add("2")
    vector.addAll(listOf("4", "6", "8"))

    printVecotr(vector)

    print("\n")

    for (value in vector) {
        print("$value\t")
    }
}

fun printVecotr(arr: Vector<String>) {
    print("\n In Print Array function\n")
    for (i in arr.indices) {
        if (i == 0) {
            arr[i] = "Start"
        }
        print("${arr[i]}\t")
    }
}
