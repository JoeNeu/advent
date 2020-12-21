package days

import java.io.File

class DayOne{
    private val day1 = "src/main/resources/day1.txt"

    fun findTwo(): Int {
        val list = readFileAsLinesUsingReadLines(day1)
        list.forEach { first ->
            list.forEach() {second ->
                if(second.toInt() + first.toInt() == 2020) return (second.toInt() * first.toInt())
            }
        }
        return 0
    }

    fun findThree(): Int {
        val list = readFileAsLinesUsingReadLines(day1)
        list.forEach { first ->
            list.forEach() {second ->
                list.forEach() {third ->
                    if(first.toInt() + second.toInt() + third.toInt() == 2020) return (third.toInt() * second.toInt() * first.toInt())
                }
            }
        }
        return 0
    }

    fun readFileAsLinesUsingReadLines(fileName: String): List<String>
            = File(fileName).readLines()
}
