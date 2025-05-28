package chapter1.section1

fun main() {
    val list = listOf(1, 2, 3, 4)
    val iterator = list.iterator()
    println(iterator.next()) // 1
    println(iterator.next()) // 2
    println(iterator.next()) // 3
    println(iterator.next()) // 4
    println(iterator.next()) // NoSuchElementException
}
