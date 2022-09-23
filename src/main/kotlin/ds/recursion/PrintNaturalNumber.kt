package ds.recursion


fun main() {
    print("Print dec number from 10 : ")
    PrintNaturalNumber().dec(10)
    println()
    print("Print inc number till 10 : ")
    PrintNaturalNumber().inc(10)
}

class PrintNaturalNumber {
    fun dec(n: Int) {
        if (n == 0) {
            return
        }
        print("$n ") // this is executed when we are moving towards the base case as it's before function call
        dec(n - 1)
    }

    fun inc(n: Int) {
        if (n == 0) {
            return
        }
        inc(n - 1)
        print("$n ") // this will execute after the function returns
    }
}