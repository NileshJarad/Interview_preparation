package kotlin_lang_note.coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

/**
 * https://blog.canopas.com/android-9-useful-kotlin-flow-operators-you-need-to-know-b9daef4b630f
 */
fun main() = runBlocking {

    flowOnDemo()

//    zipOperator()
//    withIndextedOperator()
//    reduceOperator()
//    foldOperator()
}

private suspend fun flowOnDemo() {
    numFlow().map {
        println("Map ${Thread.currentThread()}")
        it * 3
    }.onStart {
        println("On Start ${Thread.currentThread()}")
    }.flowOn(Dispatchers.IO) // upstream
        .collect {
            println("collectt ${Thread.currentThread()}")
        }
}

private suspend fun foldOperator() {
    val foldValue = numFlow().take(3).fold("45") { acc: String, value: Int -> acc + value }
    println("Fold value = $foldValue")
}

private suspend fun reduceOperator() {
    /**
     * reduce operator
     * - Accumulates value starting with the first element and applying operation to current accumulator value and each element
     *  - Reduce operator allows performing operation over all items of the flow to reduce them into one item.
     */

    val reducesValue: Int = numFlow().take(3).reduce { acc, value -> value + acc }
    println("Reduced values = $reducesValue")
}

private suspend fun withIndextedOperator() {
    numFlow().withIndex().collect {
        println("Values = ${it.index} ${it.value}")
    }
}


/**
 *
 * Zip operator
 * https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/zip.html
 *
 * Zips values from the current flow (this) with other flow using provided transform function applied to each pair of values.
 * The resulting flow completes as soon as one of the flows completes and cancel is called on the remaining flow.
 */
private suspend fun zipOperator() {
    numFlow().zip(namesFlow()) { num, name -> "$num - $name" }.collect {
        println("Zipped values = $it")
    }
}

fun numFlow() = flow {
    val nums = listOf(1, 2, 3, 4, 56, 6, 7, 8, 9)
    for (int in nums) {
        delay(100)
        emit(int)
    }
}


fun namesFlow() = flow {
    val names = listOf("AJ", "AL", "PJ", "NJ", "PK", "SP")
    for (name in names) {
        delay(100)
        emit(name)
    }
}