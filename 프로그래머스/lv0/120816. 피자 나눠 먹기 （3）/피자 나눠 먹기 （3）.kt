import kotlin.math.ceil
class Solution {
    fun solution(slice: Int, n: Int): Int = ceil(n.toDouble()/slice.toDouble()).toInt()
}