package chapter2.section1

fun naturalsSequence(): Sequence<Int> = sequence {
    var i = 0
    while (i < Int.MAX_VALUE) {
        yield(++i)
    }
}

fun main() {
    val iterator = naturalsSequence().iterator()
    println(iterator.next()) // 1
    println(iterator.next()) // 2
    println(iterator.next()) // 3

    for (num in naturalsSequence().take(5)) {
        println(num)
    }
    // 1
    // 2
    // 3
    // 4
    // 5

    println(naturalsSequence().take(3).toList())
    // [1, 2, 3]
}