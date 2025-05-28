package chapter3.section3

fun main() {
    sequenceOf(1, 2, 3, 4)
        .filter {
            println("filter $it")
            it % 2 == 0
        }
        .map {
            println("map $it")
            it * it
        }
        .forEach {
            println("forEach $it")
        }
}