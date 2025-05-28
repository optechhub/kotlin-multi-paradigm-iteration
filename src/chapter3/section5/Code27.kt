package chapter3.section5

fun main() {
    val strings = listOf("a", "b", "c", "d", "e")

    // 무한 시퀀스
    val infiniteIndices = generateSequence(0) { it + 1 }

    // zip으로 결합
    val zipped = infiniteIndices.zip(strings.asSequence())

    println(zipped.toList())
    // [(0, a), (1, b), (2, c), (3, d), (4, e)]

    println(zipped.take(2).toList())
    // [(0, a), (1, b)]
}