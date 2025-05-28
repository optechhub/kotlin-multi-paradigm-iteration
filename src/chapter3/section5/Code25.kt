package chapter3.section5

fun main() {
    val keysList = listOf("name", "job", "location")
    val valuesList = listOf("Marty", "Programmer", "New York")

    val pairs = keysList.zip(valuesList)
    println(pairs)
    // [(name, Marty), (job, Programmer), (location, New York)]

    val combinedMap = pairs.toMap()
    println(combinedMap)
    // {name=Marty, job=Programmer, location=New York}
}