package multi_threading

typealias JavaObjectClass = java.lang.Object

fun main() {
    val waitAndYieldMethod = WaitAndYieldMethod()
    Thread {
        waitAndYieldMethod.startTyping()
    }.start()

    Thread {
        waitAndYieldMethod.openEditor()
    }.start()
}

class WaitAndYieldMethod {

    var editorOpen = false

    @Synchronized
    fun startTyping() {
        println("Typing to be start")

        if (editorOpen) {
            println("Typing started")
        } else {
            try {
                println("Waiting...")
                (this as JavaObjectClass).wait()
            } catch (_: Exception) {
            }
        }
        println("Typing finished")
    }

    @Synchronized
    fun openEditor() {
        editorOpen = true
        (this as JavaObjectClass).notify()
    }
}

