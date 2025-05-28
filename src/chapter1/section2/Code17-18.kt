package chapter1.section2

class ReverseIterable<T>(private val list: List<T>) : Iterable<T> {
    override fun iterator(): Iterator<T> {
        return ReverseIterator(list)
    }
}

fun main() {
    val reversedNumbers = ReverseIterable(listOf(1, 2, 3, 4, 5))

    reversedNumbers
        .map { it * 2 }
        .filter { it >= 6 }
        .forEach { println("Reverse item: $it") }
    // Reverse item: 10
    // Reverse item: 8
    // Reverse item: 6

    // Iterable<T>에 mapToStr 확장 함수를 추가합니다.
    fun <T> Iterable<T>.mapToStr(): List<String> {
        return this.map { it.toString() }
    }

    val numbers = listOf(101, 102, 103, 103, 104)
    println(
        numbers
            .filter { it % 2 == 1 }
            .mapToStr()
            .reduce { a, b -> a + b }
    )
    // 101103103

    numbers
        .toSet()    // Set<Int>로 변경
        .mapToStr()
        .forEach { println(it.substring(1..2)) }
    // 01
    // 02
    // 03
    // 04

    ReverseIterable(numbers)
        .filter { it % 2 == 0}
        .mapToStr()
        .forEach { println(it.replace("0", "5")) }
    // 154
    // 152
}