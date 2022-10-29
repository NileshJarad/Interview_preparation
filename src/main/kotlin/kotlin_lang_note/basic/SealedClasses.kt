package kotlin_lang_note.basic


fun main() {

}


/**
 * Enum are used to store the constant  values that are not changes in future
 */

enum class Color(val color: String) {
    RED("light red"), // are constant , can not hold dynamic property
    GREEN("light green"),
    BLUE("light blue")
}


/**
 *  - Class < sealed class < enum
 *  - Dynamic value can be hold
 *  - subclass should preset in same file can be written outside shape class
 */
sealed class Shape {
    class Circle(var radius: Float) : Shape()
    class Rectangle(var side: Float) : Shape()
    data class Square(var len: Float, val bre: Float) : Shape()
    object NoShape : Shape()
}