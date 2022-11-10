package kotlin_lang_note.basic

fun main() {
    val charA = 'A'
    println("Int for the $charA = ${charA.code}")

    val int = 65
    println("Char for $int = ${int.toChar()}")

    val charH = 'H'

    println("Index of $charH in 26 is  = ${charH - charA}")

}