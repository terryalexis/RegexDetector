import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class IntegerDetectorTest {

    @Test
    fun matchesPatternReturnsTrueIfInteger() {
        var integerDetector = IntegerDetector()
        val result = integerDetector.matchesPattern("123")
        assertTrue(result)
    }

    @Test
    fun matchesPatternReturnsFalseIfNotInteger() {
        var integerDetector = IntegerDetector()
        val result = integerDetector.matchesPattern("asdf")
        assertFalse(result)
    }

    @Test
    fun patternToString() {
        var integerDetector = IntegerDetector()
        assertEquals("Integer", integerDetector.patternToString())
    }
}