class Solution {
    fun solution(n: Int): IntArray {
    var answer   = mutableListOf<Int>()
    var temp = 1
    while (temp<=n && temp%2==1){
        answer.add(temp)
        temp+=2
    }
    return answer.toIntArray() 
    }
}