package kotlin_lang_note.basic


fun main() {
    val list = listOf(8, 2, 3, 4, 5, 6, 99, 1)

    val filterList = list.filter { it < 8 } // {2,3,4,5,6,1}

    filterList.forEach {
        println("value = $it")
    }


    println("-----")

    val mapList = list.map { num -> num * num } // {64,4,9,16,25,9801,1}
    mapList.forEach {
        println("value = $it")
    }

    println("-----")
    val filterMap = list.filter { it < 8 }.map { it * it }

    filterMap.forEach {
        println("value = $it")
    }
    println("-----")

    val myPredicate: (Int) -> Boolean = { it < 8 }

    val allGreaterThan100 = list.all { num -> num > 100 } // check if all elements are > 100
    println("allGreaterThan100 = $allGreaterThan100")

    val anyGreaterThan80 = list.any { num -> num > 80 } // check if any elements is > 80
    println("anyGreaterThan80 = $anyGreaterThan80")

    val countLessThan8 = list.count { num -> num < 8 } // count number of item < 8
    println("countLessThan8 = $countLessThan8")

    val findLessThan8 = list.find(myPredicate) // find first element matching the predicate i.e < 8
    println("findLessThan8 = $findLessThan8")
}