package chapter3.section1

fun main() {
    fun sumOfSquaresOfOddNumbers(limit: Int, list: List<Int>): Int {
        var acc = 0
        var remaining = limit
        for (a in list) {
            if (a % 2 == 1) {
                val b = a * a
                acc += b
                if (--remaining == 0) break
            }
        }
        return acc
    }

    println(sumOfSquaresOfOddNumbers(3, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    // 35
}