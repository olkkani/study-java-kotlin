class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer = numbers[0]
        var index = 1

        while(answer <= n){
            answer += numbers[index]
            index++
        }
        return answer
    }
}