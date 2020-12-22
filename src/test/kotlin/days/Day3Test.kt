package days

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class Day3Test {
    private val day = Day3()

    @Test
    fun `Day3 Part 1`() {
        assertEquals(BigInteger("228"), day.partOne())
    }

    @Test
    fun `Day3 Part 2`() {
        assertEquals(BigInteger("6818112000"), day.partTwo())
    }
}
