class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.sorted().filterIndexed { index, i -> index >= 5 }.toIntArray()



}