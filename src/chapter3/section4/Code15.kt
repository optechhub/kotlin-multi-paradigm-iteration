package chapter3.section4

data class Player(
    val name: String,
    val pointsPerGame: Int,    // 경기당 평균 득점 (Points Per Game)
    val starter: Boolean
)

data class Team(
    val name: String,
    val players: List<Player>
)

val teams = listOf(
    Team(
        name = "Bears",
        players = listOf(
            Player("Luka",    pointsPerGame = 32, starter = true),
            Player("Anthony", pointsPerGame = 28, starter = true),
            Player("Kevin",   pointsPerGame = 15, starter = false),
            Player("Jaylen",  pointsPerGame = 14, starter = false),
            Player("Chris",   pointsPerGame = 22, starter = true),
            Player("Derrick", pointsPerGame = 10, starter = false),
            Player("Dillon",  pointsPerGame = 31, starter = true),
            Player("John",    pointsPerGame = 18, starter = true)
        )
    ),
    Team(
        name = "Lions",
        players = listOf(
            Player("Stephen", pointsPerGame = 37, starter = true),
            Player("Zach",    pointsPerGame = 20, starter = true),
            Player("Nikola",  pointsPerGame = 19, starter = false),
            Player("Austin",  pointsPerGame = 22, starter = true),
            Player("Bruce",   pointsPerGame = 13, starter = false),
            Player("Damian",  pointsPerGame = 33, starter = true),
            Player("Tyrese",  pointsPerGame = 29, starter = true),
            Player("Jamal",   pointsPerGame = 11, starter = false)
        )
    ),
    Team(
        name = "Wolves",
        players = listOf(
            Player("Jayson",  pointsPerGame = 32, starter = true),
            Player("Klay",    pointsPerGame = 37, starter = true),
            Player("Andrew",  pointsPerGame = 15, starter = false),
            Player("Patrick", pointsPerGame = 14, starter = false),
            Player("Malik",   pointsPerGame = 24, starter = true),
            Player("Buddy",   pointsPerGame = 10, starter = false),
            Player("Jordan",  pointsPerGame = 27, starter = true),
            Player("Kyle",    pointsPerGame = 18, starter = true)
        )
    ),
    Team(
        name = "Tigers",
        players = listOf(
            Player("DeMar",   pointsPerGame = 37, starter = true),
            Player("Marcus",  pointsPerGame = 21, starter = true),
            Player("Al",      pointsPerGame = 19, starter = false),
            Player("Dennis",  pointsPerGame = 22, starter = true),
            Player("Miles",   pointsPerGame = 14, starter = false),
            Player("Paul",    pointsPerGame = 29, starter = true),
            Player("Fred",    pointsPerGame = 13, starter = false),
            Player("Terry",   pointsPerGame = 25, starter = true)
        )
    )
)

fun main() {
    // 1) 리그의 주전 선수들의 PPG 합산
    val totalStartersPPG = teams
        .map { it.players }
        .flatten()
        .filter { it.starter }
        .map { it.pointsPerGame }
        .reduce { a, b -> a + b }

    println(totalStartersPPG) // 544

    // 2) 주전 선수들의 평균 PPG
    val averageStartersPPG = teams
        .flatMap { it.players }
        .filter { it.starter }
        .map { it.pointsPerGame }
        .average()

    println(averageStartersPPG) // 27.2
}
