package chapter2.section1

fun main() {
    val seq = sequence {
        yield(1)
        if (false) {
            yield(2)
        }
        yield(3)
    }
    for (n in seq) {
        println(n)
    }
    // 1
    // 3
}