import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ViewHelperTest {

    @Test
    fun getMatchingPattern() {
        var viewHelper = ViewHelper()
        assertEquals("", viewHelper.matchingPattern)
    }

    @Test
    fun detectPatternReturnsEmptyStringIfNoMatches() {
        var viewHelper = ViewHelper()
        viewHelper.detectPattern("asdf")
        assertEquals("", viewHelper.matchingPattern)
    }

    @Test
    fun detectPatternReturnsIntegerIfMatchFound() {
        var viewHelper = ViewHelper()
        viewHelper.detectPattern("123")
        assertSame("Integer", viewHelper.matchingPattern)
    }
}