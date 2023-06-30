class Solution {
fun solution(my_string: String): String = my_string.map {
        when (it.isLowerCase()) {
            true -> it.uppercase()
            else -> it.lowercase()
        }
    }.joinToString("")
}