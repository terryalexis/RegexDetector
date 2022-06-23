package states.integerStates

import IntegerDetector

class InvalidState: IntegerState {
    private var detector: IntegerDetector = IntegerDetector()

    override fun setDetector(detector: IntegerDetector) {
        this.detector = detector
    }

    override fun typedIntegerGreaterThanZero(input: String) {
        TODO("Not yet implemented")
    }

    override fun typedZero(input: String) {
        TODO("Not yet implemented")
    }

    override fun typedNotAnInteger(input: String) {
        TODO("Not yet implemented")
    }
}