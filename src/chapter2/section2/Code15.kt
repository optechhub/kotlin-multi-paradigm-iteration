package chapter2.section2

fun <T> reverseSequence(list: List<T>): Sequence<T> = sequence {
    var i = list.size - 1
    while (i > -1) {
        yield(list[i--])
    }
}

fun main() {
    val seq = reverseSequence(listOf(1, 2, 3, 4, 5))

    // 시퀀스에서 이터레이터를 얻어 직접 사용
    val iter = seq.iterator()

    println(iter.next())
    println(iter.next())
    // 5
    // 4

    println(
        iter.asSequence().take(2).toList()
    )
    // [3, 2]
}