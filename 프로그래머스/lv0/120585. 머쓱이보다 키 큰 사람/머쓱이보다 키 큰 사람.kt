class Solution {
    fun solution(array: IntArray, height: Int): Int {
    var count : Int = 0
    array.forEach { i ->
        if (i > height) count++
    }
    return count
    }
}