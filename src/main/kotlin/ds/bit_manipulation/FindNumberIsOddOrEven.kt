package ds.bit_manipulation

/**
 * Find the number is odd or even without using %
 *
 * Last digit of the binary representation decides if number is odd or even
 *
 *          If last bit is 1 then number is odd
 *          If last bit is 0 then number is even
 */
fun main() {

    val num = 26
    print("Binary representation of $num = ${num.toUInt().toString(2)}\n")
    print("Binary representation of 1 = ${1.toUInt().toString(2)}\n")

    if(num and 1  == 0){
        print("Even")
    }else{
        print("Odd")
    }
}