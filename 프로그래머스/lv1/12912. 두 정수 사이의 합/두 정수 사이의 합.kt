class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        
        var startNum: Int = 0
        var endNum: Int  = 0
        
        if (a > b) {
            startNum = b
            endNum = a
        }else if (a < b){
            startNum = a
            endNum = b
        }else {
            return a.toLong()
        }
        
        for (i in startNum .. endNum){
            answer += i 
        }
        
        return answer
    }
}