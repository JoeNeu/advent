package days

import utils.ReadFile

class Day4 {
    private val list = ReadFile.readFileAsLinesUsingReadLines("src/main/resources/day4.txt")

    fun isValid(): Int {
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
}

data class Person (
        var byr: Boolean,
        var iyr: Boolean,
        var eyr: Boolean,
        var hgt: Boolean,
        var hcl: Boolean,
        var ecl: Boolean,
        var pid: Boolean
)

