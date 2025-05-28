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

    fun sumSelectedQuantities2(products: List<Product>): Int =
        products
            .filter { it.selected }       // 선택된 상품만 필터링
            .map { it.options }           // 각 상품의 옵션 배열로 변환
            .flatten()                    // 옵션 배열을 펼쳐 1차원 배열로 변환
            .sumOf { it.quantity }        // 각 옵션의 수량 추출 + 총합 계산

    fun calcSelectedPrices2(products: List<Product>): Int =
        products
            .filter { it.selected }       // 선택된 상품만 필터링
            .map { prd ->
                prd.options.map { opt ->
                    (prd.price + opt.price) * opt.quantity  // 옵션별 최종 가격 계산
                }
            }
            .flatten()   // 모든 옵션의 가격 배열을 펼침
            .sum()       // 총합 계산

    println(sumSelectedQuantities2(products)) // 선택된 상품의 총 수량: 15
    println(calcSelectedPrices2(products))    // 선택된 상품의 총 가격: 214,500
}