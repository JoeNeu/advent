import days.*

fun main(args: Array<String>) {
    val day1 = Day1()
    val day2 = Day2()
    val day3 = Day3()
    val day4 = Day4()
    val day5 = Day5()
    println("Day1: " + day1.findTwo())
    println("Day1: " + day1.findThree())
    println("Day2: " + day2.findCorrectPasswords())
    println("Day2: " + day2.findCorrectPasswordsExtended())
    println("Day3: " + day3.countTrees())
    println("Day3: " + day3.countTreesExtended())
    println("Day4: " + day4.isPassportValid())
    println("Day4: " + day4.isPassportValidExtended())
    println("Day5: " + day5.searchHighestId())
}
