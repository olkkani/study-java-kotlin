class Solution {
    fun solution(s: String): IntArray {
        val answer: MutableList<Int> = mutableListOf<Int>().apply { add(-1) }
        val words = s.chunked(1)


        for (i in 1 until words.size){
            var gapCount = -1

            for (j in i-1 downTo 0){
                if(words[i] == words[j]){
                    gapCount = i-j
                    break
                }
            }
            answer.add(gapCount)
        }
        return answer.toIntArray()
    }
}