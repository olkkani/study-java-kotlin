class Solution {
    fun solution(s: String): String {
        var answer = ""
        s.toCharArray().sortedArrayDescending().map{ answer += it }
        return answer
    }
}