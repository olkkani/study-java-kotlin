class Solution {
    fun solution(angle: Int): Int {
        val answer: Int = if (angle < 90){
            1
        } else if (angle == 90){
            2
        } else if (angle == 180){
            4
        } else {
            3
        }
        return answer
    }
}