package days

import utils.FileReader

class Day1 {
    private val list = FileReader.asLines("src/main/resources/day1.txt").sorted()

    fun partOne(): Int {
        list.forEach { first ->
            list.forEach() { second ->
                if (second.toInt() + first.toInt() == 2020)
                    return (second.toInt() * first.toInt())
            }
        }
        return 0
    }

    fun partTwo(): Int {
        list.forEach { first ->
            list.forEach() { second ->
                list.forEach() { third ->
                    if (first.toInt() + second.toInt() + third.toInt() == 2020)
                        return (third.toInt() * second.toInt() * first.toInt())
                }
            }
        }
        return 0
    }
}
