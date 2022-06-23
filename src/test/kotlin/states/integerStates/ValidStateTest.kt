package states.integerStates

import IntegerDetector
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ValidStateTest {
    @Test
    fun testTypedIntegerGreaterThanZeroDoesNotChangeStatus() {
        var validState = ValidState()
        var detector = IntegerDetector()
        detector.state = detector.validState
        validState.typedIntegerGreaterThanZero("9", detector)
        assertEquals(detector.validState, detector.state)
    }

    @Test
    fun typedZeroDoesNotChangeStateIfStartingValueExists() {
        var validState = ValidState()
        var detector = IntegerDetector()
        detector.state = detector.validState
        detector.hasStartingValue = true
        validState.typedZero("0", detector)
        assertEquals(detector.validState, detector.state)
    }

    @Test
    fun typedZeroChangesStateIfStartingValueDoesNotExist() {
        var validState = ValidState()
        var detector = IntegerDetector()
        detector.state = detector.validState
        detector.hasStartingValue = false
        validState.typedZero("0", detector)
        assertEquals(detector.invalidState, detector.state)
    }

    @Test
    fun typedNotAnIntegerChangesState() {
        var validState = ValidState()
        var detector = IntegerDetector()
        detector.state = detector.validState
        validState.typedNotAnInteger("g", detector)
        assertEquals(detector.invalidState, detector.state)
    }
}