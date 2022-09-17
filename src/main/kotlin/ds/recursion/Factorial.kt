package ds.recursion

fun main() {
    println("Factorial of 5 = ${Factorial().factorial(5)}")
    println("Factorial of 3 = ${Factorial().factorial(3)}")
}

class Factorial {
    fun factorial(n : Int) : Int{
        // base case
        if(n == 0){
            return 1
        }
        return n*factorial(n-1)
    }
}


/***
 *              Call stack                  After call complete
 *
 *          |  ans= 1*factorial(0)   |      returns 1
 *          -------------------------
 *          |  ans= 1*factorial(0)   |      ans = 1 * 1 = 1
 *          -------------------------
 *          |  ans= 2*factorial(1)   |      ans = 2 * 1 = 2
 *          -------------------------
 *          |  ans= 3*factorial(2)   |      ans = 3 * 2 = 6
 *          -------------------------
 *          |  ans= 4*factorial(3)   |      ans = 4 * 6 = 24
 *          -------------------------
 *          |  ans= 5*factorial(4)   |      ans = 5 * 24 = 120
 *          -------------------------
 *          |    main 5              |      main prints 120
 *          -------------------------
 */