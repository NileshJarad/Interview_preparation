package ds.trie


fun main() {
    val trieExample = TrieExample()
    trieExample.insertWord("Nilesh")
    trieExample.insertWord("Jarad")
    trieExample.insertWord("Nil")
    trieExample.insertWord("Jared")
    trieExample.insertWord("Jar")

    println("Search 'Nil' found = " + trieExample.searchWord("Nil"))
    println("Search 'Jara' found = " + trieExample.searchWord("Jara"))
    println("Prefix 'Jara' found = " + trieExample.prefix("Jara"))
    println("Prefix 'Niles' found = " + trieExample.prefix("Niles"))
    println("Prefix 'Nilesh' found = " + trieExample.prefix("Nilesh"))
}


class Trie(
    val data: Char, val hashMap: HashMap<Char, Trie> = HashMap(), var endOfWord: Boolean = false
)


class TrieExample {
    private val root = Trie(Char.MIN_VALUE)
    fun insertWord(word: String) {
        var temp = root
        word.forEachIndexed { index: Int, _ ->
            val char = word[index]
            if (!temp.hashMap.containsKey(char)) {
                temp.hashMap[char] = Trie(char)
            }
            temp.hashMap[char]?.let {
                temp = it
            }
        }
        temp.endOfWord = true
    }

    fun searchWord(word: String): Boolean {
        var temp = root
        word.forEachIndexed { _, char ->
            if (temp.hashMap[char] == null) {
                return false
            }
            temp.hashMap[char]?.let {
                temp = it
            }
        }
        return temp.endOfWord
    }

    fun prefix(word: String): Boolean {
        var temp = root
        word.forEachIndexed { _, char ->
            if (temp.hashMap[char] == null) {
                return false
            }
            temp.hashMap[char]?.let {
                temp = it
            }
        }
        return true
    }
}