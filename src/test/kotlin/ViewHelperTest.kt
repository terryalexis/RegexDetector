import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ViewHelperTest {

    @Test
    fun getMatchingPattern() {
        var viewHelper = ViewHelper()
        assertEquals("", viewHelper.matchingPattern)
    }

//    @Test
//    fun detectPattern() {
//
//    }
}