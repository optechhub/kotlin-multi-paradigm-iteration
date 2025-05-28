package chapter2.section1

fun main() {
    val seq = sequence {
        yield(1)
        yieldAll(listOf(2, 3, 4))
        yield(5)
    }

    val iterator = seq.iterator()
    println(iterator.next()) // 1
    println(iterator.next()) // 2
    println(iterator.next()) // 3
}