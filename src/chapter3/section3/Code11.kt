package chapter3.section3

fun <T, R> Iterator<T>.map(transform: (T) -> R): Iterator<R> {
    return object : Iterator<R> {
        override fun hasNext(): Boolean = this@map.hasNext()
        override fun next(): R {
            val value = this@map.next()
            println("map")
            return transform(value)
        }
    }
}

fun <T> Iterator<T>.take(n: Int): Iterator<T> {
    return object : Iterator<T> {
        var count = 0

        override fun hasNext(): Boolean {
            return count < n && this@take.hasNext()
        }

        override fun next(): T {
            if (!hasNext()) throw NoSuchElementException()
            count++
            println("take count: $count")
            return this@take.next()
        }
    }
}

fun main() {
    val iter = listOf(2, 4, 6, 8).iterator()
        .map { it * it }
        .take(2)

    for (a in iter) {
        println("result: $a")
    }
}