package chapter2.section2

fun main() {
    val seq = sequenceOf("A", "B", "C")

    // 시퀀스에서 이터레이터를 얻어 직접 사용
    val iter = seq.iterator()

    while (iter.hasNext()) {
        println(iter.next())
    }
    // A
    // B
    // C
}