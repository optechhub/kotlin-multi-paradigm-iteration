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
    println(iter.next()) // 2

    println(seq.take(2).toList()) // [1, 2]

    val iter2 = seq.iterator()
    println(iter2.next()) // 1
    println(iter2.next()) // 2
}