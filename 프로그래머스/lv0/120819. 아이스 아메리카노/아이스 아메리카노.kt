class Solution {
    fun solution(money: Int): IntArray {
        val coffeePrice: Int = 5_500
        var answer: IntArray = intArrayOf(money/coffeePrice, money%coffeePrice)
        return answer
    }
}