package chapter1.section1

fun main() {
    val iterable = listOf(1, 2, 3, 4) as Iterable<Int>
    for (n in iterable) {
        println(n)
    }
    // 1
    // 2
    // 3
    // 4
}
