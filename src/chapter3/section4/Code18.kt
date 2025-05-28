package chapter3.section4


fun main() {
    data class Product(
        val name: String,
        val price: Int,
        val quantity: Int,
        val selected: Boolean
    )

    val products = listOf(
        Product(name = "티셔츠", price = 10000, quantity = 1, selected = true),
        Product(name = "셔츠", price = 30000, quantity = 2, selected = false),
        Product(name = "바지", price = 15000, quantity = 2, selected = true)
    )

    fun sumSelectedQuantities(products: List<Product>): Int =
        products
            .filter { it.selected }         // 선택된 상품만 필터링
            .map { it.quantity }            // 수량만 추출
            .reduce { a, b -> a + b }       // 합산

    fun calcSelectedPrices(products: List<Product>): Int =
        products
            .filter { it.selected }                // 선택된 상품만 필터링
            .sumOf { it.price * it.quantity }        // 총 가격 계산 + 합산


    println(sumSelectedQuantities(products)) // 선택된 상품의 총 수량: 3
    println(calcSelectedPrices(products))    // 선택된 상품의 총 가격: 40,000
}