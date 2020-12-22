package days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day4Test {
    private val day = Day4()

    @Test
    fun `Day4 Part 1`() {
        assertEquals(233, day.partOne())
    }

    @Test
    fun `Day4 Part 2`() {
        assertEquals(111, day.partTwo())
    }
}
