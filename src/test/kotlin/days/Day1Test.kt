package days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day1Test {
    private val day = Day1()
    @Test
    fun `Day1 Part 1`() {

        assertEquals(751776, day.partOne())
    }

    @Test
    fun `Day1 Part 2`() {
        assertEquals(42275090, day.partTwo())
    }
}
