package days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day5Test {
    private val day = Day5()

    @Test
    fun `Day5 Part 1`() {
        assertEquals(930, day.partOneAndTwo(partTwo = false))
    }

    @Test
    fun `Day5 Part 2`() {
        assertEquals(515, day.partOneAndTwo(partTwo = true))
    }
}
