package chapter2.section1

fun main() {
    val seq = sequence {
        yield(1)
        for (n in listOf(2, 3, 4)) {
            yield(n)
        }
        yield(5)
    }

    for (n in seq) {
        println(n)
    }
    // 1
    // 2
    // 3
    // 4
    // 5
}