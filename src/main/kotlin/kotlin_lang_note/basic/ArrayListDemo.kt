package kotlin_lang_note.basic

import java.util.*
import kotlin.collections.ArrayList
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main() {
    val t = ArrayList<Int>(1)

    for (i in 0 until 33_000) {
        t.add(i)
    }
    val time33K = measureTimedValue {
        val c = ArrayList<Int>()
        c.addAll(t)
        c.addAll(c)
    }
    println("${Date()} Time taken time33K = ${time33K.duration.inWholeMilliseconds}")

    val timeNormal = measureTimedValue {
        val d = ArrayList<Int>(33_000)
    }

    println("${Date()}  Time taken normal  = ${timeNormal.duration.inWholeMilliseconds}")
}

