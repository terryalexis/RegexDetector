import states.integerStates.*

class IntegerDetector: Detector {
    val validState: IntegerState = ValidState()
    val invalidState: IntegerState = InvalidState()

    init {
        validState.setDetector(this)
        invalidState.setDetector(this)
    }

    var state: IntegerState = invalidState
    var hasStartingValue: Boolean = false

    override fun matchesPattern(input: String): Boolean {
        val splitInput = input.split("").toList()
        for(symbol: String in splitInput) {
            val symbolAscii = symbol.toCharArray()[0].code
            val asciiForZero = 48
            val asciiForNine = 57
            when (symbolAscii) {
                in (asciiForZero + 1)..asciiForNine -> {
                    state.typedIntegerGreaterThanZero(symbol)
                }
                asciiForZero -> {
                    state.typedZero(symbol)
                }
                else -> {
                    state.typedNotAnInteger(symbol)
                }
            }
        }
        return state == validState
    }

    override fun patternToString(): String {
        return "Integer"
    }
}