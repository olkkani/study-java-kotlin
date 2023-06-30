class Solution {
    fun solution(numbers: IntArray): Int {
        var maxNum = 0

        for(i in numbers.indices){
            for (j in numbers.indices){
                val firstNum = numbers[i]
                val secondNum = numbers[j]
                if(i != j && maxNum < firstNum * secondNum) { maxNum = firstNum * secondNum}
            }
        }
        return maxNum
    }
}