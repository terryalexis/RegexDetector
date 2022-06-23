package states.integerStates

import IntegerDetector

class ValidState: IntegerState {
    private var detector: IntegerDetector = IntegerDetector()

    override fun setDetector(detector: IntegerDetector) {
        this.detector = detector
    }

    override fun typedIntegerGreaterThanZero(input: String) {
        // Do nothing -- string is still valid
    }

    override fun typedZero(input: String) {
        // Do nothing -- string is still valid
    }

    override fun typedNotAnInteger(input: String) {
        detector.state = detector.invalidState
    }
}