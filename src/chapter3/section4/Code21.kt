package chapter3.section4


fun main() {
    data class Option(
        val name: String,
        val price: Int,
        val quantity: Int
    )

    data class Product(
        val name: String,
        val price: Int,
        val selected: Boolean,
        val options: List<Option>
    )

    val products = listOf(
        Product(
            name = "티셔츠",
            price = 10000,
            selected = true,
            options = listOf(
                Option("L", 0, 3),
                Option("XL", 1000, 2),
                Option("2XL", 3000, 2)
            )
        ),
        Product(
            name = "셔츠",
            price = 30000,
            selected = false,
            options = listOf(
                Option("L", 0, 2),
                Option("XL", 1000, 5),
                Option("2XL", 3000, 4)
            )
        ),
        Product(
            name = "바지",
            price = 15000,
            selected = true,
            options = listOf(
                Option("XL", 500, 3),
                Option("2XL", 3000, 5)
            )
        )
    )

    fun calcProductOptionPrices(prd: Product): List<Int> =
        prd.options.map { opt ->
            (prd.price + opt.price) * opt.quantity
        }

    fun calcTotalPrice(products: List<Product>): Int =
        products
            .flatMap(::calcProductOptionPrices)
            .sum()

    fun calcSelectedPrices2(products: List<Product>): Int =
        calcTotalPrice(
            products.filter { it.selected }
        )

    println(calcTotalPrice(products))      // 모든 상품 총 가격 561,500
    println(calcSelectedPrices2(products)) // 선택된 상품의 총 가격 214,500
}