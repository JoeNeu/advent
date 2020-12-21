package days

import utils.ReadFile.readFileAsLinesUsingReadLines
import java.math.BigInteger

class Day3 {
    private val list = readFileAsLinesUsingReadLines("src/main/resources/day3.txt").map{
        line -> line.toCharArray()
    }

    fun countTrees(): BigInteger {
        return search(3)
    }

    fun countTreesExtended(): BigInteger {
        return search(1) * search(3) * search(5) * search(7) * search(1, true)
    }

    private fun search(shift: Int, twoSteps: Boolean = false): BigInteger {
        var x = shift
        var jumpRow = twoSteps
        var count = BigInteger.ZERO
        list.drop(1).forEach{row ->
            if(jumpRow) {
                jumpRow = false
            } else {
                if(row[x] == '#') count++
                x = (x+shift) % 31
                if(twoSteps) jumpRow = true
            }
        }
        return count
    }
}
