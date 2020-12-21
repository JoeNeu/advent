package days

import java.io.File

class Day3 {
    private val day3 = "src/main/resources/day3.txt"

    fun count() {
        val list = readFileAsLinesUsingReadLines(day3)
    }

    fun readFileAsLinesUsingReadLines(fileName: String): List<String>
            = File(fileName).readLines()
}
