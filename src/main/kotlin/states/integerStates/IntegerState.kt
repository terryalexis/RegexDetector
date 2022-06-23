package states.integerStates

import IntegerDetector

interface IntegerState {
    fun setDetector(detector: IntegerDetector)
    fun typedIntegerGreaterThanZero(input: String)
    fun typedZero(input: String)
    fun typedNotAnInteger(input: String)
}