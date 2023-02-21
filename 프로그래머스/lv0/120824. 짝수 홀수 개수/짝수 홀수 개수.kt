class Solution {
    fun solution(num_list: IntArray): IntArray {
    var a = 0
    var b = 0
    for (num in num_list){
        if(num%2==1){
            b++
        } else {
            a++
        }
    }
    
    return intArrayOf(a,b)
    }
}