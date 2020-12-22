package days

import utils.ReadFile

class Day1{
    private val list = ReadFile.readFileAsLinesUsingReadLines("src/main/resources/day1.txt")

    fun findTwo(): Int {
        list.forEach { first ->
            list.forEach() {second ->
                if(second.toInt() + first.toInt() == 2020)
                    return (second.toInt() * first.toInt())
            }
        }
        return 0
    }

    fun findThree(): Int {
        list.forEach { first ->
            list.forEach() {second ->
                list.forEach() {third ->
                    if(first.toInt() + second.toInt() + third.toInt() == 2020)
                        return (third.toInt() * second.toInt() * first.toInt())
                }
            }
        }
        return 0
    }
}
