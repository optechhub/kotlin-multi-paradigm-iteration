package chapter3.section2

fun String.isKotlinFile(): Boolean {
    return this.endsWith(".kt")
}

fun main() {
    val fileName = "HelloWorld.kt"
    println(fileName.isKotlinFile())
    // true
}