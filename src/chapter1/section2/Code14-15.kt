package chapter1.section2

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    numbers
        .map { it * 10 }
        .filter { it >= 30 }
        .forEach { println("List item: $it") }
    // List item: 30
    // List item: 40
    // List item: 50

    val set = setOf("Apple", "Banana", "Cherry", "Apple")
    // ["Apple", "Banana", "Cherry"]

    set
        .map { it.uppercase() }            // [APPLE, BANANA, CHERRY]
        .filter { it.startsWith('A') }     // [APPLE]
        .forEach { println("Set item: $it") }
    // Set item: APPLE
}