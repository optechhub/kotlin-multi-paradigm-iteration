package chapter2.section2


fun main() {
    val seq = sequence {
        yield(1)
        yield(2)
        yield(3)
        yield(4)
        yield(5)
    }

    val iter = seq.iterator()
    println(iter.next()) // 1

    val seq2 = iter.asSequence()
    println(seq2.take(2).toList()) // [2, 3]

    seq2.iterator()
    // IllegalStateException: This sequence can be consumed only once.
}