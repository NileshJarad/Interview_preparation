package practice.array

fun main() {
    val dupList = listOf(1, 2, 3, 1, 5, 6, 6, 7)

    println("To Set")
    dupList.toSet().forEach {
        print("$it ,")
    }

    println()
    println("To Hash Set")
    dupList.toHashSet().forEach {
        print("$it ,")
    }

    println()
    println("To Mutable list")
    dupList.toMutableSet().forEach {
        print("$it ,")
    }

    println()
    println("To distinct")
    dupList.distinct().forEach {
        print("$it ,")
    }
}