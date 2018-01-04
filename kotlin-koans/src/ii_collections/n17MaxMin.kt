package ii_collections


import java.util.*
import kotlin.Comparator

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? =
// this.customers.sortedWith(Comparator<Customer> { x, y -> y.orders.count() - x.orders.count() }).first()
//        this.customers.maxWith(Comparator { x, y -> x.orders.count() - y.orders.count() })
this.customers.maxBy { it->it.orders.size}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // Return the most expensive product which has been ordered
//    return this.orderedProducts.maxWith(Comparator { o1, o2 -> o1.price.compareTo(o2.price) })
    return this.orderedProducts.maxBy { it->it.price }
}
