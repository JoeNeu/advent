package days

import utils.ReadFile.readFileAsLinesUsingReadLines

class Day3 {
    private val list = readFileAsLinesUsingReadLines("src/main/resources/day3.txt").map{
        line -> line.toCharArray()
    }

    fun countTrees(): Int {
        var count = 0
        var x = 3
        list.drop(1).forEach{row ->
            if(row[x] == '#') count++
            x = (x+3) % 31
        }
        return count
    }

    fun countTreesExtended(): Int {
        var count = 0
        var x = 3
        list.drop(1).forEach{row ->
            if(row[x] == '#') count++
            x = (x+3) % 31
        }
        return count
    }
}
