class Solution {

    fun solution(nums: IntArray): Int {
        var countPrimeNumber = 0

        for (i in 0 .. nums.size-3){
            for (j in i+1 .. nums.size-2){
                for (k in j+1 until nums.size){
                    val number = nums[i] + nums[j] + nums[k]
                    if(isPrimeNumber(number)){countPrimeNumber++}
                }
            }
        }
        return countPrimeNumber
    }


    private fun isPrimeNumber(number: Int): Boolean {
        for (i in number - 1 downTo 2) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

}