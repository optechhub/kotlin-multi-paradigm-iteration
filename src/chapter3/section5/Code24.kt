package chapter3.section5

fun main() {
    val keysList = listOf("name", "job", "location")
    val valuesList = listOf("Marty", "Programmer", "New York")

    val combinedMap = mutableMapOf<String, String>()
    for (i in keysList.indices) {
        combinedMap[keysList[i]] = valuesList[i]
    }

    println(combinedMap)
    // {name=Marty, job=Programmer, location=New York}
}