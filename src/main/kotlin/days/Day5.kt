package days

import utils.ReadFile

class Day5 {
    private val list = ReadFile.readFileAsLinesUsingReadLines("src/main/resources/day5.txt").map {
        it.toCharArray()
    }
    private var rows = (0..127).toList().toIntArray()
    private var seats = (0..7).toList().toIntArray()

    fun searchHighestId(): Int {
        var highestId = 0
        val idList: MutableList<Int> = mutableListOf()
        list.forEach{ ticket ->
            var row = rows
            var seat = seats
            ticket.forEach { selector ->
                when(selector) {
                    'B' -> {
                        row = row.drop(row.size/2).toIntArray()
                    }
                    'F' -> {
                        row = row.dropLast(row.size/2).toIntArray()
                    }
                    'R' -> {
                        seat = seat.drop(seat.size/2).toIntArray()
                    }
                    'L' -> {
                        seat = seat.dropLast(seat.size/2).toIntArray()
                    }
                }
            }
            val current = row[0]* 8 + seat[0]
            idList.add(current)
            if(highestId < current) {
                highestId = current
            }
        }
        println("Day5:1 ${highestId}")
        val sortedList = idList.toIntArray().sorted()
        sortedList.forEach{
            if(!sortedList.contains(it + 1)) {
                return it+1
            }
        }
        return 0
    }
}
