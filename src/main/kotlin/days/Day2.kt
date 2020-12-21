package days

import utils.ReadFile

class Day2 {
    private val list = ReadFile.readFileAsLinesUsingReadLines("src/main/resources/day2.txt")

    fun findCorrectPasswords(): Int {
        var count = 0
        list.forEach { line ->
            val parts = line.split(" ")
            val numbers = parts[0].split("-")
            val occourrences = countOccurrences(parts[2], parts[1].toCharArray().first())
            if(occourrences in numbers[0].toInt()..numbers[1].toInt()) count++
        }
        return count
    }

    fun findCorrectPasswordsExtended(): Int {
        var count = 0
        list.forEach { line ->
            val parts = line.split(" ")
            val numbers = parts[0].split("-")
            val searchItem = parts[1].toCharArray().first()
            val password = parts[2].toCharArray()

            if((password[numbers[0].toInt() - 1] == searchItem)
                            .xor(password[numbers[1].toInt() - 1] == searchItem)) {
                count ++
            }
        }
        return count
    }

    fun countOccurrences(s: String, ch: Char): Int {
        return s.filter { it == ch }.count()
    }
}
