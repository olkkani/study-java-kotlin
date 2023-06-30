class Solution {
    fun solution(start: Int, end: Int): IntArray {
        val answer = mutableListOf<Int>()
        for (i in start .. end){
            answer.add(i)
        }
        

        return answer.toIntArray()
    }
}