package days

import utils.FileReader

class Day6 {
    private val list = FileReader.asText("src/main/resources/day6.txt").split("\n\n")

    fun partOne(): Int {
        var count = 0
        list.forEach { row ->
            count += row.replace("\n", "").toCharArray().distinct().size
        }
        return count
    }

    fun partTwo(): Int {
        var count = 0
        list.forEach { row ->
            var group = row.replace("\n", "").toCharArray()
            row.split("\n").forEach {
                group = group.intersect(it.toList()).toCharArray()
            }
            count += group.size
        }
        return count
    }
}
