package practice.string

/**
 *
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
 * the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 *
 * Example 2:
 * Input: s = "axc", t = "axc"
 * Output: false
 */
fun main() {
    print(IsSubsequence().isSubsequence("abc", "ahbgdc")) // true
    println()
    print(IsSubsequence().isSubsequence("axc", "ahbgdc")) // false
     println()
    print(IsSubsequence().isSubsequence("axc", "b")) // false

}

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        val sLen = s.length
        val tLen = t.length
        var si = 0
        var ti = 0
        while (si < sLen && ti < tLen) {
            if (s[si] == t[ti]) {
                si++
            }
            ti++;
        }
        return si == sLen
    }
}