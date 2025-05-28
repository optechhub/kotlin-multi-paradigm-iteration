package chapter2.section1

fun <T> reverseSequence(list: List<T>): Sequence<T> = sequence {
    var i = list.size - 1
    while (i > -1) {
        yield(list[i--])
    }
}

//fun <T> reverseSequence(list: List<T>): Sequence<T> = sequence {
//    var i = list.size - 1
//    while (i > -1) {
//        println("reverse ${list[i]}")
//        yield(list[i--])
//    }
//}

fun main() {
    for (elem in reverseSequence(listOf(1, 2, 3))) {
        println(elem)
    }
    // 3
    // 2
    // 1

    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    val reversedSeq = reverseSequence(list)
    println(reversedSeq.take(2).toList())
    // reverse 7
    // reverse 6
    // [7, 6]
}