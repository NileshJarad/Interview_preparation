package kotlin_lang_note.refresh

/**
 * https://medium.com/@maydin/kotlin-quiz-refresh-your-kotlin-knowledge-1-2269065fd457
 */

fun main() {
    open class Shape
    class Rectangle: Shape()

    fun Shape.getName() = "Shape"
    fun Rectangle.getName() = "Rectangle"

    fun printClassName(s: Shape) {
        println(s.getName())
    }

    printClassName(Rectangle())


    class Example {
        fun printFunctionType() { println("Class method") }
    }

    fun Example.printFunctionType() { println("Extension function") }

    Example().printFunctionType()
}

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}
