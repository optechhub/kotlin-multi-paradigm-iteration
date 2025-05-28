package chapter3.section5

fun <T> Sequence<T>.takeUntilInclusive(predicate: (T) -> Boolean): Sequence<T> = sequence {
    for (item in this@takeUntilInclusive) {
        yield(item)
        if (predicate(item)) break
    }
}

fun main() {
    // takeWhile
    sequenceOf(1, 2, 3, 0, 0, 0, 5, 6)
        .onEach { println("takeWhile: $it, ${it >= 1}") }
        .takeWhile { it >= 1 }
        .forEach { println("forEach: $it") }

    // 출력
    // takeWhile: 1 true
    // forEach: 1
    // takeWhile: 2 true
    // forEach: 2
    // takeWhile: 3 true
    // forEach: 3
    // takeWhile: 0 false

    println("---") // ---

    // takeUntilInclusive
    sequenceOf(0, 10, 1, 3, 5, 0, 4, 2)
        .onEach { println("takeUntilInclusive: $it, ${it == 5}") }
        .takeUntilInclusive { it == 5 }
        .forEach { println("forEach: $it") }

    // takeUntilInclusive: 0 false
    // forEach: 0
    // takeUntilInclusive: 10 false
    // forEach: 10
    // takeUntilInclusive: 1 false
    // forEach: 1
    // takeUntilInclusive: 3 false
    // forEach: 3
    // takeUntilInclusive: 5 true
    // forEach: 5
}