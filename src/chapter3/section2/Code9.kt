package chapter3.section2

inline fun <T, R> Sequence<T>.chain(
    transform: (Sequence<T>) -> Sequence<R>
): Sequence<R> {
    return transform(this)
}

fun main() {
    sequenceOf(3, 6, 5, 4, 2, 1, 4)
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .chain { input ->
            sequence {
                for (item in input) {
                    yield(item)
                    if (item < 5) break
                }
            }
        }
        .forEach { println(it) }
    // 12
    // 8
    // 4
}