package chapter1.section1

fun main() {
    val letters = setOf("A", "B", "A", "C")
    // [A, B, C]

    for (letter in letters) {
        println(letter)
    }
    // A
    // B
    // C

    val iter = letters.iterator()
    while (iter.hasNext()) {
        println(iter.next())
    }
    // A
    // B
    // C
}
