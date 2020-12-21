import days.DayOne
import days.DayTwo

fun main(args: Array<String>) {
    val dayOne = DayOne()
    val dayTwo = DayTwo()
    println("Day1: " + dayOne.findTwo())
    println("Day1: " + dayOne.findThree())
    println("Day2: " + dayTwo.findCorrectPasswords())
    println("Day2: " + dayTwo.findCorrectPasswordsExtended())
}
