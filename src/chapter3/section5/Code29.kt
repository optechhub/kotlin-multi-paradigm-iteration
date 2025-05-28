package chapter3.section5

fun main() {
    fun nextCollatzValue(n: Int): Int =
        if (n % 2 == 0) n / 2
        else n * 3 + 1

    fun collatzCount(num: Int): Int =
        generateSequence(num, ::nextCollatzValue)
            .drop(1)
            .withIndex()
            .find { it.value == 1 }!!
            .index + 1

    println(collatzCount(1)) // 3
    println(collatzCount(4)) // 2
    println(collatzCount(5)) // 5
    println(collatzCount(6)) // 8
    println(collatzCount(11)) // 14
}