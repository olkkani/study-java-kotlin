import java.util.Arrays

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        return Arrays.stream(array).filter{it == n}.count().toInt()
    }
}