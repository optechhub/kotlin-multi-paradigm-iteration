package chapter2.section1

fun main() {
    val seq = sequence {
        yield(1)
        yield(2)
        yield(3)
    }

    // 순회할 때마다 하나씩 생성 (지연 평가)
    val iterator = seq.iterator()

    println(iterator.next()) // 1
    println(iterator.next()) // 2
    println(iterator.next()) // 3
    println(iterator.next()) // NoSuchElementException
}