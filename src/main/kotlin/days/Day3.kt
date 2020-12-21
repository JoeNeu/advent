package days

import java.io.File

class Day3 {
    private val day3 = "src/main/resources/day3.txt"

    fun count(): Int {
        val list = readFileAsLinesUsingReadLines(day3).map{
            line -> line.toCharArray()
        }
        var count = 0
        var x = 3
        list.drop(1).forEach{row ->
            if(row[x] == '#') count++
            x = (x+3) % 31
        }
        return count
    }

    fun readFileAsLinesUsingReadLines(fileName: String): List<String>
            = File(fileName).readLines()
}
