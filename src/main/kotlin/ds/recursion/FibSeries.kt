package ds.recursion

fun main() {
    println("Fib  7 term : ${FibSeries().fib(7)}")
    println("Fib  5 term : ${FibSeries().fib(5)}")
}

class FibSeries {
    fun fib(n: Int): Int {
        if (n == 0 || n == 1) {
            return n
        }
        return fib(n-1) + fib(n-2)
    }
}