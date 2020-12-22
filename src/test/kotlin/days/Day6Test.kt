package days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day6Test {
    private val day = Day6()

    @Test
    fun `Day6 Part 1`() {
        assertEquals(6633, day.partOne())
    }

    @Test
    fun `Day6 Part 2`() {
        assertEquals(3202, day.partTwo())
    }
}
