package chapter3.section5

fun main() {
    val strings = listOf("a", "b")
    val indexed = strings.withIndex();
    indexed.forEach { println("${it.index}, ${it.value}") }
    // 0, a
    // 1, b
    indexed.map { (i, v) -> "$i, $v" }.forEach(::println)
    // 0, a
    // 1, b

    listOf("a", "b", "c", "d")
        .asSequence()
        .withIndex()
        .take(2)
        .forEach(::println)
    // IndexedValue(index=0, value=a)
    // IndexedValue(index=1, value=b)

    listOf("a", "b", "c", "d")
        .asSequence()
        .mapIndexed { i, v -> "$i: $v" }
        .take(3)
        .forEach(::println)
    // 0: a
    // 1: b
    // 2: c
}