package ds.bit_manipulation


/***
 * Bitwise operator work on binary representation of the data
 * Bitwise operator are fast as compared to non-bitwise operator
 *
 * Different type of bitwise operator
 *  1) Bitwise And (&)
 *          - Set bit if both are 1
 *          - kotlin `and`
 *  2) Bitwise Or (|)
 *          - Set bit if either is 1
 *          - kotlin `or`
 *  3) Bitwise Xor (^)
 *          - Sets bit if bits miss-match
 *          - kotlin `xor`
 *  4) Bitwise complement (~)
 *          - Makes all bit inverted
 *          - For any integer n, 2's complement of n will be -(n+1).
 *          - ~6 =  -7 , ~8 =-9 , ~(-500) = 499
 *          - kotlin `inv()`
 *  5) Shift left (<<)
 *          - Shifts bits to left by
 *          - Kotlin `shl`
 *  6) Shift right (>>)
 *          - Shifts bits to right by
 *          - Kotlin `shr`
 *
 *  How to calculate the binary number for given number
 *
 *
 *
 *Power of 2      2^4   2^3   2^2     2^1     2^0
 *Value           16    8     4       2       1
 *Number 8        0     1     0       0       0
 *Number 7        0     0     1       1       1
 *Number 6        0     0     1       1       0
 *
 * https://www.programiz.com/kotlin-programming/bitwise
 */

fun main() {

    val minus500 = -500
    val two = 2
    val eight = 8
    val six = 6
    val seven = 7

    print("Bitwise And of ($six , $seven) = ${six and seven}") // 6
    print("\nBitwise Or of ($six , $eight) = ${six or eight}") // 14
    print("\nBitwise XOR of ($six , $eight) = ${six xor eight}") // 14 as xor gives 1 if both bits are different
    print("\nBitwise complement of $minus500 = ${minus500.inv()}") // 499
    print("\nBitwise complement of $six = ${six.inv()}") // -7
    print("\nBitwise Left Shift of ($six , $two) = ${six shl two}") // shift bits by 2 to left = 24
    print("\nBitwise Right Shift of ($six , $two) = ${six shr two}") // shift bits by 2 to right = 1

}