package chapter2.section1

fun main() {
    val seq = sequence {
        yield(1)
        println("A")
        yield(2)
        yield(3)
    }

    // 순회할 때마다 하나씩 생성 (지연 평가)
    val iterator = seq.iterator()

    println(iterator.next()) // 1을 반환
    println(iterator.next()) // A를 출력하고 2를 반환
    println(iterator.next()) // 3을 반환
}