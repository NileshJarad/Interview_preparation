package multi_threading

fun main() {

    val t1 = YieldMethodOne()
    t1.start()
    val t2 = YieldMethodTwo()
    t2.start()

}

class YieldMethodOne : Thread() {
    override fun run() {
        for (i in 0..5) {
            println("Thread one is running One")
            yield()
        }
    }
}

class YieldMethodTwo : Thread() {
    override fun run() {
        for (i in 0 until 5) {
            println("Thread one is running   Two")
        }
    }
}