package chapter2.section2

class ReverseIterator<T>(private val list: List<T>) : Iterator<T> {
    private var index = list.size - 1

    override fun hasNext(): Boolean {
        return index > -1
    }

    override fun next(): T {
        if (!hasNext()) throw NoSuchElementException()
        return list[index--]
    }
}

fun main() {
    val iter: Iterator<Int> = ReverseIterator(listOf(1, 2, 3, 4, 5))

    // 이터레이터를 시퀀스로 변환
    val seq = iter.asSequence()

    println(seq.take(2).toList())
    // 5
    // 4

    println(iter.next()) // 3
    println(iter.next()) // 2
}