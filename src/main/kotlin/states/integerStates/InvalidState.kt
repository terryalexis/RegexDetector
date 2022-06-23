package states.integerStates

import IntegerDetector

class InvalidState: IntegerState {

    override fun typedIntegerGreaterThanZero(input: String, detector: IntegerDetector) {
        if(!detector.hasStartingValue) {
            detector.hasStartingValue = true
            detector.state = detector.validState
        }
    }

    override fun typedZero(input: String, detector: IntegerDetector) {
        if(!detector.hasStartingValue) {
            detector.hasStartingValue = true
        }
    }

    override fun typedNotAnInteger(input: String, detector: IntegerDetector) {
        // Do nothing -- state is still invalid
    }
}