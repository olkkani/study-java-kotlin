class Solution {
    fun solution(my_string: String): String {
        val gathers : CharArray = charArrayOf('a', 'i', 'e', 'o', 'u')
        return my_string.filter { !gathers.contains(it) }
    }
}