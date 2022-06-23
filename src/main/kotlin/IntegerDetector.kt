class IntegerDetector: Detector {
    override fun matchesPattern(input: String): Boolean {
        if(input.toIntOrNull() == null) {
            return false
        }
        return true
    }

    override fun patternToString(): String {
        return "integer"
    }
}