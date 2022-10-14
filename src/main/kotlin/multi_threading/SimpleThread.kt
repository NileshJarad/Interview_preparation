package multi_threading

fun main() {
    println("Main Thread Name  = ${Thread.currentThread().name}")
    val threadRunnable = SimpleThread()
    val thread = Thread(threadRunnable)
//    thread.start() // this will create the new call stack
    thread.run() // this will not create the separate call stack it continues


    val t1 = ThreadUsingThreadClass()
    t1.name = "T1"
    t1.start()

    val t2 = ThreadUsingThreadClass()
    t2.name = "T2"
    t2.start()

}

class SimpleThread : Runnable {
    override fun run() {
        println("SimpleThread Thread Name =  ${Thread.currentThread().name}")
    }
}

class ThreadUsingThreadClass : Thread() {
    override fun run() {
        val name = currentThread().name
        println("ThreadUsingThreadClass Thread Name =  $name")
        for (i in 0..5) {
            println("$name = $i")
            try {
                sleep(1000)
            } catch (_: InterruptedException) {

            }
        }
    }
}