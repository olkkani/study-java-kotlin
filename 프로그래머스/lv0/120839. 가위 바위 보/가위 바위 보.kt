class Solution {
    fun solution(rsp: String): String = rsp.map{
        when (it) {
            '0' -> "5"
            '2' -> "0"
            else -> "2"
        }
    }.joinToString("")
}