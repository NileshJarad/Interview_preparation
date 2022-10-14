package multi_threading


fun main() {
    val thread1 = Thread(JoinMethod(), "thread1")
    val thread2 = Thread(JoinMethod(), "thread2")
    val thread3 = Thread(JoinMethod(), "thread3")

    thread1.start()


    /**
     * As we have discussed the join() method pause the execution of current.
     * In the below example, we are writing the join() method in the main thread.
     * So, it will pause the execution of the main thread.
     */
    thread1.join()
    thread2.start()
    thread2.join()
    thread3.start()
}

class JoinMethod : Runnable {
    override fun run() {
        val thread = Thread.currentThread()
        for (i in 1..3) println(thread.name + " running : " + i)

        println("Thread ended: " + thread.name)
    }
}