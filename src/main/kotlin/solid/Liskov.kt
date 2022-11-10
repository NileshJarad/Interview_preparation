package solid

/***
 *Simply put, the Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable
 * with objects of its subclasses without breaking the application.
 *
 *
 * If function take instance of class then same function should be able to take
 * instance of the derived class from that class
 *
 */

fun main() {

    val menu1 = MenuItem(100f, "item1", "This is item1")
    val menu2 = BeverageItem(1000f, "item1", "This is item1")
    printPrice(menu1)
    printPrice(menu2)
}

fun printPrice(item: MenuItem) {
    println()

    /**
     * In below line to get discounted price of beverage we need  to call getDiscounted Price
     * which violets Liskov principle
     */
    if (item is BeverageItem) {
        print(" BeverageItem Item price 1 : ${item.discountedPrice()}")
    } else {
        print("Item price1 : ${item.price}")
    }

    /**
     * To solve this we need to add the getDiscount as private method in both the class
     *
     *  1) Added implementation of get price in Beverage Item class
     *  2) Added getDiscount in both class with get price method
     */


    println()
    if (item is BeverageItem) {
        print(" BeverageItem Item price 2 : ${item.price}")
    } else {
        print("Item price 2: ${item.price}")
    }


}


open class MenuItem(price: Float, private var name: String, private var description: String) {
    private var _price = 0.0f
    open var price: Float = price
        get() {
            return field - getDiscount()
        }

    open fun getDiscount(): Float {
        return 0.0F
    }

}

class BeverageItem(price: Float, name: String, description: String) : MenuItem(price, name, description) {
    override fun getDiscount(): Float {
        return 200F
    }

    fun discountedPrice(): Float {
        return price - price * 0.1F
    }
}