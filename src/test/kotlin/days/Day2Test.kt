package days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day2Test {
    private val day = Day2()

    @Test
    fun `Day2 Part 1`() {
        assertEquals(517, day.partOne())
    }

    @Test
    fun `Day2 Part 2`() {
        assertEquals(284, day.partTwo())
    }
}
