class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var number = n
        while (number > 0){
            answer += number % 10
            number /= 10 
        }
        return answer
    }
}