interface Detector {
    fun matchesPattern(input: String): Boolean
    fun patternToString(): String
}