package states.integerStates

import IntegerDetector

interface IntegerState {
    fun typedIntegerGreaterThanZero(input: String, detector: IntegerDetector)
    fun typedZero(input: String, detector: IntegerDetector)
    fun typedNotAnInteger(input: String, detector: IntegerDetector)
}