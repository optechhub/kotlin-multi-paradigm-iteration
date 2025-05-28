package chapter3.section1

fun main() {
    fun sumOfSquaresOfOddNumbers(limit: Int, list: List<Int>): Int =
        list.asSequence()
            .filter { it % 2 == 1 }
            .map { it * it }
            .take(limit)
            .fold(0) { a, b -> a + b }

    println(sumOfSquaresOfOddNumbers(3, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    // 35
}