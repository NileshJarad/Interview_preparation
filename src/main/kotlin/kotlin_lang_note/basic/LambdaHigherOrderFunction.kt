package kotlin_lang_note.basic


fun main() {


    val addLambda: (Int, Int) -> Int = { x, y -> x + y }
    val minusLambda: (Int, Int) -> Int = { x, y -> x - y }

    val lambdaHigherOrderFunction = LambdaHigherOrderFunction()
    lambdaHigherOrderFunction.doMath(2, 2, addLambda)
    lambdaHigherOrderFunction.doMath(2, 2, minusLambda)
    lambdaHigherOrderFunction.doMath(4, 2) { x, y -> x * y }
}

class LambdaHigherOrderFunction {
    fun doMath(n1: Int, n2: Int, action: (Int, Int) -> Int) {
        val result = action(n1, n2)
        println("Result = $result")
    }
}