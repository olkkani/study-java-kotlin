class Solution {
    fun solution(array: IntArray): Int {
    array.sortDescending()
    val size = array.size
    return array[size/2]
    }
}