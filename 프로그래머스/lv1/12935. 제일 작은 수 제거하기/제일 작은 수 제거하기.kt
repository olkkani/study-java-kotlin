import java.util.Arrays

class Solution {
    fun solution(arr: IntArray): IntArray {
     var answer = IntArray(arr.size-1)
        var min: Int =Arrays.stream(arr).min().orElse(0)

        return if (arr.size == 1){
            intArrayOf(-1)
        } else {
            var j: Int = 0
            for (i in arr) {
                if (i != min) {
                    answer[j] = i
                    j++
                }
            }
            answer
        }
    }
}