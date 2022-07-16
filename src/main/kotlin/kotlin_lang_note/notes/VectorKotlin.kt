import java.util.Vector

/**
 * Vector is is dynamic array All element are in contiguous memory with adavantage of change of size
 *
 * When vector runs out of space while addindg element then it doubles the size
 *
 * In kotlin vector are passed by value.
 */
fun main() {
    val vector = Vector<String>(5)

    vector.addElement("1")
    vector.add("2")
    vector.addAll(listOf("4", "6", "8"))

    print("Size of Vector is  ${vector.size}")
    print("\nSize of Vector is  ${vector.capacity()}")

    // As we are adding extra element in the vector it will run out of space and it will double it's
    // size
    vector.add("last")

    print("Size of Vector is  ${vector.size}")
    print("\nSize of Vector is  ${vector.capacity()}")

    printVector(vector)

    print("\n")

    for (value in vector) {
        print("$value\t")
    }
}

fun printVector(arr: Vector<String>) {
    print("\n In Print Vector function\n")
    for (i in arr.indices) {
        if (i == 0) {
            arr[i] = "Start"
        }
        print("${arr[i]}\t")
    }
}
