package days

import utils.FileReader

class Day22 {
    private val list = FileReader.asText("src/main/resources/day22.txt").split("\n\n")


    fun partOne(): Int {
        val playerList: MutableList<MutableList<Int>> = mutableListOf()

        list.forEach { player ->
            playerList.add(player
                    .split(":\n")[1]
                    .split("\n")
                    .filter { it.isNotBlank() }
                    .map { it.toInt() }
                    .toMutableList())
        }

        val winner = findWinner(playerList)
        var count = 0
        val points = (winner.size downTo 1)
        for ((index, value) in points.withIndex()) {
            count += value * winner[index]
        }
        return count
    }

    private fun findWinner(playerList: MutableList<MutableList<Int>>): MutableList<Int> {
        do {
            if (playerList[0][0] < playerList[1][0]) {
                playerList[1].add(playerList[1][0])
                playerList[1].add(playerList[0][0])
            } else {
                playerList[0].add(playerList[0][0])
                playerList[0].add(playerList[1][0])
            }
            playerList[0] = playerList[0].drop(1).toMutableList()
            playerList[1] = playerList[1].drop(1).toMutableList()
        } while (playerList[0].isNotEmpty() && playerList[1].isNotEmpty())
        return  if (playerList[0].isNotEmpty())
                    playerList[0]
                else
                    playerList[1]
    }

    fun partTwo(): Int {
        return 0
    }

}
