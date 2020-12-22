package days

import utils.FileReader

class Day6 {
    private val list = FileReader.asLines("src/main/resources/day6.txt").map {
        it.toCharArray()
    }

    fun countOfAnswers(): Int {
        var count = 0
        var group: MutableList<Char> = mutableListOf()
        list.forEach {row ->
            if(!row.isEmpty()) {
                row.forEach { char ->
                    group.add(char)
                }
            } else {
                group = group.distinct().toMutableList()
                count += group.size
                group.clear()
            }
        }
        group = group.distinct().toMutableList()
        count += group.size
        return count
    }

    fun countAllSameAnswers(): Int {
        var count = 0
        val group: MutableList<Char> = mutableListOf()
        var rows = 0
        list.forEach {row ->
            if(!row.isEmpty()) {
                row.forEach { char ->
                    group.add(char)
                }
                rows++
            } else {
                group.groupingBy { it }.eachCount().map{ tuple ->
                    if(tuple.value == rows)
                        count++
                }
                group.clear()
                rows = 0
            }
        }
        group.groupingBy { it }.eachCount().map{ tuple ->
            if(tuple.value == rows)
                count++
        }
        return count
    }
}
