package multi_threading


fun main() {
    println("Started main")

    val t = SingleThreadDeadLock()
    t.start()
}


class SingleThreadDeadLock() : Thread() {
    override fun run() {
        println("Called the Single Thread DeadLock")
        join()
        println("This will never executes")
    }

}

