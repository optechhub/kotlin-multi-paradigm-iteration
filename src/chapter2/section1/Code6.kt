package chapter2.section1

fun main() {
    val seq = sequence {
        yield(1)
        for (n in listOf(2, 3, 4)) {
            if (n < 4) yield(n)
        }
        yield(5)
    }

    println(seq.toList())
    // [1, 2, 3, 5]
}