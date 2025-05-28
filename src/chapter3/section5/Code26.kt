package chapter3.section5

fun main() {
    val strings = listOf("a", "b", "c", "d")
    val zipped = (0..3).zip(strings)
    println(zipped)
    // [(0, a), (1, b), (2, c), (3, d)]
}