class Solution {
    fun solution(x: Int): Boolean {
        return x % digitSum(x) == 0
    }

    private fun digitSum(number: Int): Int {
        var num = number
        var digitSum = 0
        while (num > 0) {
            digitSum += num % 10
            num /= 10
        }

        return digitSum
    }
}