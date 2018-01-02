package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products this customer has ordered
    return this.orders.map({ it -> it.products }).flatMap { it -> it.toList() }.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
    return this.customers.map({ it -> it.orderedProducts }).flatMap { it -> it.toList() }.toSet()
}
