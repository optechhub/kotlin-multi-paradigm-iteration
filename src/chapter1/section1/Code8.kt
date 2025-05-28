package chapter1.section1

fun main() {
    val list = listOf(1, 2, 3, 4)
    val iterator = list.iterator()
    for (n in iterator) {
        println(n)
    }
    // 1
    // 2
    // 3
    // 4
}
