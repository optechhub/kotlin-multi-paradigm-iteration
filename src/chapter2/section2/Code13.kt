package chapter2.section2

fun main() {
    val iter: Iterator<Int> = listOf(1, 2, 3, 4, 5).iterator()

    // 이터레이터를 시퀀스로 변환
    val seq = iter.asSequence()

    // 이터레이터에는 없는 확장 함수(take, forEach)를 사용
    seq.take(3).forEach(::println)
    // 1
    // 2
    // 3
}