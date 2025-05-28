package chapter3.section2

fun <T> Sequence<T>.takeUntilInclusive(predicate: (T) -> Boolean): Sequence<T> = sequence {
    for (item in this@takeUntilInclusive) {
        yield(item)
        if (predicate(item)) break
    }
}

fun main() {
    sequenceOf(3, 6, 5, 4, 2, 1, 4)
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .takeUntilInclusive { it < 5 }
        .forEach { println(it) }
    // 12
    // 8
    // 4
}