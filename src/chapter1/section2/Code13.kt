package chapter1.section2

class NaturalsIterator : Iterator<Int> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < Int.MAX_VALUE
    }

    override fun next(): Int {
        if (!hasNext()) throw NoSuchElementException()
        return ++index
    }
}


fun main() {
    val naturals = NaturalsIterator()
    println(naturals.next())
    println(naturals.next())
    println(naturals.next())
    println(naturals.next())
    // 1
    // 2
    // 3
    // 4
}