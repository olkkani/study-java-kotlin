class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        return numbers.filterIndexed{ index, _ ->
            index >= num1 && index <= num2
        }.toIntArray()
    }
}