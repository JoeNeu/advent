package days

import utils.Person
import utils.ReadFile

class Day4 {
    private val list = ReadFile.readFileAsLinesUsingReadLines("src/main/resources/day4.txt")

    private val eyeColor = listOf(
            "amb", "blu", "brn", "gry", "grn", "hzl", "oth"
    )

    fun isPassportValid(): Int {
        var count = 0
        var person = Person(false, false, false, false, false, false, false)
        list.forEach {row ->
            if(!row.isEmpty()) {
                if(row.contains("byr")) person.byr = true
                if(row.contains("iyr")) person.iyr = true
                if(row.contains("eyr")) person.eyr = true
                if(row.contains("hgt")) person.hgt = true
                if(row.contains("hcl")) person.hcl = true
                if(row.contains("ecl")) person.ecl = true
                if(row.contains("pid")) person.pid = true
            } else {
                if (person.byr && person.iyr && person.eyr && person.hgt && person.hcl && person.ecl && person.pid) {
                    count++
                }
                person = Person(false, false, false, false, false, false, false)
            }
        }
        if (person.byr && person.iyr && person.eyr && person.hgt && person.hcl && person.ecl && person.pid) {
            count++
        }
        return count
    }

    fun isPassportValidExtended(): Int {
        var count = 0
        var person = Person(false, false, false, false, false, false, false)
        list.forEach {row ->
            if(!row.isEmpty()) {
                row.split(" ").forEach {item ->
                    val part = item.split(":")
                    if(part[0].contains("byr")) {
                        if(part[1].toInt() in 1920..2002)
                            person.byr = true
                    }
                    if(part[0].contains("iyr")) {
                        if(part[1].toInt() in 2010..2020)
                            person.iyr = true
                    }
                    if(part[0].contains("eyr")) {
                        if(part[1].toInt() in 2020..2030)
                            person.eyr = true
                    }
                    if(part[0].contains("hgt")) {
                        if(part[1].contains("cm")) {
                            if(part[1].filter { it.isDigit() }.toInt() in 150..193)
                                person.hgt = true
                        }
                        if(part[1].contains("in")) {
                            if(part[1].filter { it.isDigit() }.toInt() in 59..76)
                                person.hgt = true
                        }
                    }
                    if(part[0].contains("hcl")) {
                        if(part[1].matches(Regex("#[0-9a-f]{6}")))
                            person.hcl = true
                    }
                    if(part[0].contains("ecl")) {
                        if(eyeColor.contains(part[1]))
                            person.ecl = true
                    }
                    if(part[0].contains("pid")) {
                        if(part[1].length == 9)
                            person.pid = true
                    }
                }
            } else {
                if (person.byr && person.iyr && person.eyr && person.hgt && person.hcl && person.ecl && person.pid) {
                    count++
                }
                person = Person(false, false, false, false, false, false, false)
            }
        }
        if (person.byr && person.iyr && person.eyr && person.hgt && person.hcl && person.ecl && person.pid) {
            count++
        }
        return count
    }
}
