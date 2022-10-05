class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var nn: Long = 1

        while (nn * nn < n){
            nn++
        }

        answer = if (nn * nn == n){
            nn++
            nn * nn
        }else {
            -1
        }

        return answer
    }
}