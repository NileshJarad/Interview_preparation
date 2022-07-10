/*
Array is one of the most fundamental data structure in practically all programming languages.
The idea behind an array is to store multiple items of the same data-type,such as an integer or string under a single variable name.
Arrays are used to organize data in programming so that a related set of values can be easily sorted or searched.

Here are some basic properties of arrays –

1. They are stored in contiguous memory locations.
2. They can be accessed through their indexes (array[1], array[0], etc.)
3. They are mutable.
4. Their size is fixed.


Note:  In kotlin arrays are passed by value


Everything in Java is passed by value. In case of an array (which is nothing but an Object), the array reference is passed by value (just like an object reference is passed by value).

When you pass an array to other method, actually the reference to that array is copied.

Any changes in the content of array through that reference will affect the original array.
But changing the reference to point to a new array will not change the existing reference in original method.

*/

fun main() {
    // using arrayOf function
    val arrayUsingArrayOfFunction = arrayOf(1, 3, 4, 5, 6)

    printArray(arrayUsingArrayOfFunction)
    print("\n In Main \n")
    for (value in arrayUsingArrayOfFunction) {
        print("\t $value")
    }

    print("\n")

    // using Array constructor
    // kotlin array value are default initialised to Unit if we don't provide initialization
    val arrayUsingArrayConstructor = Array(4, { i -> i * 20 })

    printArray(arrayUsingArrayConstructor)
    print("\n In Main \n")

    for (value in arrayUsingArrayConstructor) {
        print("\t $value")
    }

    // define array of IntArray
    val numbers = intArrayOf(1, 2, 3, 4)

    /*
    Other factory methods available for creating arrays:
        byteArrayOf()
        charArrayOf()
        shortArrayOf()
        longArrayOf()
    */
}

fun printArray(arr: Array<Int>) {
    print("\n In Print Array function\n")
    for (i in arr.indices) {
        if (i == 0) {
            arr[i] = 100
        }
        print("\t ${arr[i]}")
    }
}
