package states.integerStates

import IntegerDetector
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class InvalidStateTest {

    @Test
    fun testTypedIntegerGreaterThanZeroCorrectlyChangesStateToValid() {
        var invalidState = InvalidState()
        var detector = IntegerDetector()
        detector.hasStartingValue = false
        invalidState.typedIntegerGreaterThanZero("9", detector)
        assertEquals(detector.validState, detector.state)
    }

    @Test
    fun testTypedIntegerGreaterThanZeroCorrectlyKeepsStateInvalid() {
        var invalidState = InvalidState()
        var detector = IntegerDetector()
        detector.hasStartingValue = true
        invalidState.typedIntegerGreaterThanZero("9", detector)
        assertEquals(detector.invalidState, detector.state)
    }

    @Test
    fun typedZeroDoesNotChangeStateIfStartingValueExists() {
        var invalidState = InvalidState()
        var detector = IntegerDetector()
        detector.hasStartingValue = true
        invalidState.typedZero("0", detector)
        assertEquals(detector.invalidState, detector.state)
    }

    @Test
    fun typedZeroDoesNotChangeStateIfStartingValueDoesNotExist() {
        var invalidState = InvalidState()
        var detector = IntegerDetector()
        detector.hasStartingValue = false
        invalidState.typedZero("0", detector)
        assertEquals(detector.invalidState, detector.state)
    }

    @Test
    fun typedNotAnIntegerDoesNotChangeState() {
        var invalidState = InvalidState()
        var detector = IntegerDetector()
        invalidState.typedNotAnInteger("g", detector)
        assertEquals(detector.invalidState, detector.state)
    }
}