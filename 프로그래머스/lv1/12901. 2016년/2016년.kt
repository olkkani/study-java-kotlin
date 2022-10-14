import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

class Solution {
    fun solution(a: Int, b: Int): String {
        return LocalDate.of(2016, a, b).dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).uppercase()
    }
}