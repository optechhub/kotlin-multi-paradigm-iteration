package chapter3.section5

data class CountedValue<out T>(
    val count: Int,
    val value: T
)

fun <T> Sequence<T>.withCount(start: Int = 1): Sequence<CountedValue<T>> =
    generateSequence(start) { it + 1 }
        .zip(this) { c, elem -> CountedValue(c, elem) }

fun main() {
    fun nextCollatzValue(n: Int): Int =
        if (n % 2 == 0) n / 2
        else n * 3 + 1

    fun collatzCount(num: Int): Int =
        generateSequence(num, ::nextCollatzValue)
            .drop(1)
            .withCount()               // 카운트를 1부터 시작
            .find { it.value == 1 }!!  // value가 1인 첫 항목을 찾는다
            .count                     // 그 항목의 count가 최종 결과

    println(collatzCount(1))  // 3
    println(collatzCount(4))  // 2
    println(collatzCount(5))  // 5
}
