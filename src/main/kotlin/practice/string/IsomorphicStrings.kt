package practice.string


fun main() {
//    println("isIsomorphic  ${IsomorphicStrings().isIsomorphic("egg", "add")}") // true
//    println("isIsomorphic  ${IsomorphicStrings().isIsomorphic("foo", "bar")}") // false
//    println("isIsomorphic  ${IsomorphicStrings().isIsomorphic("s", "t")}") // true
//    println("isIsomorphic  ${IsomorphicStrings().isIsomorphic("ab", "ab")}") // true
//    println("isIsomorphic  ${IsomorphicStrings().isIsomorphic("aaeaa", "uuxyy")}") // false
//    println("isIsomorphic  ${IsomorphicStrings().isIsomorphic("paper", "title")}") // true
    println("isIsomorphic  ${IsomorphicStrings().isIsomorphic("badc", "baba")}") // false
}

class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        if (s.length == 1) {
            return s == t
        }

        val mapFromOneToTwo = HashMap<Char, Char>()
        val mapFromTwoToOne = HashMap<Char, Char>()
        for (i in s.indices) {

            val c1 = s[i]
            val c2 = t[i]
            if (mapFromOneToTwo[c1] == null && mapFromTwoToOne[c2] == null) {
                mapFromOneToTwo[c1] = c2
                mapFromTwoToOne[c2] = c1
            } else if (!(mapFromOneToTwo[c1] == c2 && mapFromTwoToOne[c2] == c1)) {
                    return false
            }

        }
        return true
    }
}