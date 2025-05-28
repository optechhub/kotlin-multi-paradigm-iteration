package chapter3.section4

fun main() {
    val numbers = listOf(
        listOf(1, 2),
        listOf(3, 4, 5),
        listOf(6, 7, 8),
        listOf(9, 10)
    )

    val oddSquareSum = numbers
        .flatten()                // 2차원 리스트를 1차원으로 펼치기
        .filter { it % 2 == 1 }   // 홀수만 필터링
        .map { it * it }          // 제곱
        .reduce { a, b -> a + b } // 모두 더하기

    println(oddSquareSum) // 165

    // sumOf로 축약 가능
    val oddSquareSum2 = numbers
        .flatten()
        .filter { it % 2 == 1 }
        .sumOf { it * it }

    println(oddSquareSum2) // 165
}