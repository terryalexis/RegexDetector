import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ViewHelper {
    var matchingPattern by mutableStateOf<String>("")
        private set

    private val detectors = listOf<Detector>(
        IntegerDetector()
    )

    fun detectPattern(input: String) {
        var matchFound = false
        for(detector: Detector in detectors) {
            if(detector.matchesPattern(input)) {
                matchingPattern = detector.patternToString()
                matchFound = true
            }
        }
        if(!matchFound) {
            matchingPattern = ""
        }
    }
}