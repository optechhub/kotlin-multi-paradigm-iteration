package chapter1.section2

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
    val numbers = listOf(1, 2, 3)
    val iterator = ReverseIterator(numbers)
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    // 3
    // 2
    // 1

    val strings = listOf("A", "B", "C")
    for (str in ReverseIterator(strings)) {
        println(str)
    }
    // C
    // B
    // A
}