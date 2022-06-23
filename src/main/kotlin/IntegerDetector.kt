import states.integerStates.*

class IntegerDetector: Detector {
    val validState: IntegerState = ValidState()
    val invalidState: IntegerState = InvalidState()

    var state: IntegerState = invalidState
    var hasStartingValue: Boolean = false

    override fun matchesPattern(input: String): Boolean {
        if(input == "") {
            hasStartingValue = false
        }
        val splitInput = input.toCharArray()
        for(symbol: Char in splitInput) {
            val symbolAscii = symbol.code
            val asciiForZero = 48
            val asciiForNine = 57

            when (symbolAscii) {
                in (asciiForZero + 1)..asciiForNine -> {
                    state.typedIntegerGreaterThanZero(symbol.toString(), this)
                }
                asciiForZero -> {
                    state.typedZero(symbol.toString(), this)
                }
                else -> {
                    state.typedNotAnInteger(symbol.toString(), this)
                }
            }
        }
        return state == validState
    }

    override fun patternToString(): String {
        return "Integer"
    }
}