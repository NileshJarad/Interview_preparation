package kotlin_lang_note.basic

fun main() {

    val creditCardType = CreditCardType.PLATINUM
    println("Credit card type ordinal = ${creditCardType.ordinal}")
    println("Credit card type name = ${creditCardType.name}")
    println("Credit card type color = ${creditCardType.color}")
    println("Credit card type cashback = ${creditCardType.getCashback()}")
    println("-------")
    CreditCardType.values().forEach {
        println("Credit card name ${it.name} ")
    }
}

/**
 * - Custom attribute in Enum.
 * - Implementing the interface for enum
 * - Each enum value is separate instance on enum class
 * - Enum has ordinal and name default properties
 * - Enum has values() and valueOf()
 */
enum class CreditCardType(val color: String) : Cashback {
    GOLD("gold") {
        override fun getCashback() = 500
    },
    SILVER("white") {
        override fun getCashback() = 700
    },
    PLATINUM("black") {
        override fun getCashback() = 1000
    }
}

interface Cashback {
    fun getCashback(): Int
}