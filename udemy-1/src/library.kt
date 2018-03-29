

interface Lendable{
    fun borrow()
}

abstract class InventoryItem(open val title: String, open val genre: String, open val pubYear: Int):Lendable{
    override fun borrow() {
        println("Lending ")
    }

}


class Book(override val title: String, override val genre: String, override val pubYear: Int, val author : String): InventoryItem(title,genre, pubYear) {

}

class DVD(override val title: String, override val genre: String, override val pubYear: Int, val length: Long): InventoryItem(title,genre, pubYear){

}

