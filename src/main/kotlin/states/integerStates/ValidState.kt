package states.integerStates

import IntegerDetector

class ValidState: IntegerState {
    override fun typedIntegerGreaterThanZero(input: String, detector: IntegerDetector) {
        // Do nothing -- string is still valid
    }

    override fun typedZero(input: String, detector: IntegerDetector) {
        if(!detector.hasStartingValue) {
            detector.hasStartingValue = true
            detector.state = detector.invalidState
        }
    }

    override fun typedNotAnInteger(input: String, detector: IntegerDetector) {
        detector.state = detector.invalidState
    }
}