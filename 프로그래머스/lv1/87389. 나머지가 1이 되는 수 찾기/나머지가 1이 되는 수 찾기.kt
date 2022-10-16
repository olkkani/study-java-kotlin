class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2
        while (n % answer != 1){
            answer++
        }

        return answer
    }
}