package kotlin_lang_note.basic

/**
 * 1) Backing field are generated whenever required
 * 2) Backing field !=  Backing property
 */
fun main() {
    val backingField = BackingField()
    backingField.age = 40
    println("Age = ${backingField.age}")
}

class BackingField {
    var age = 20
        get() {
            return field // generated backing field
        }
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    var name: String = "" // no backing field is generated
        private set
}


class BackingProperty {
    private var _age = 20 // this is backing field
    var age: Int // backing property
        get() = _age
        set(value) {
            _age = value
        }
}