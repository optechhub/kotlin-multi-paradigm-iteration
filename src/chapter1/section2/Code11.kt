package chapter1.section2

fun main() {
    val list = listOf("A", "B")
    val iterator = list.iterator()

    println(iterator.next()) // "A"
    println(iterator.next()) // "B"
    println(iterator.next()) // NoSuchElementException
}