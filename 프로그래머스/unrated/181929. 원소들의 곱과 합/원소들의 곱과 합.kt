import kotlin.math.pow


class Solution {
    fun solution(num_list: IntArray): Int {
    val sumPow = num_list.sum().toDouble().pow(2.0).toInt()
    var multiple = 1;
    num_list.map { multiple*=it }

    return if (sumPow > multiple) 1 else 0
    }
}