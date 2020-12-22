package days

import utils.FileReader.asLines
import java.math.BigInteger

class Day3 {
    private val list = asLines("src/main/resources/day3.txt").map { line ->
        line.toCharArray()
    }

    fun partOne(): BigInteger {
        return search(3)
    }

    fun partTwo(): BigInteger {
        return search(1) * search(3) * search(5) * search(7) * search(1, twoSteps = true)
    }

    private fun search(shift: Int, twoSteps: Boolean = false): BigInteger {
        var x = shift
        var jumpRow = twoSteps
        var count = BigInteger.ZERO
        list.drop(1).forEach { row ->
            if (jumpRow) {
                jumpRow = false
            } else {
                if (row[x] == '#') count++
                x = (x + shift) % 31
                if (twoSteps) jumpRow = true
            }
        }
        return count
    }
}
