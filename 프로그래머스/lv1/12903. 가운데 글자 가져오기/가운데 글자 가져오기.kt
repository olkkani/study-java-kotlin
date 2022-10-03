class Solution {
    fun solution(s: String): String {
        var answer = ""
        var c : CharArray = s.toCharArray();
        var center = s.length / 2

        answer = if (s.length % 2 == 0){
            c[center -1 ].toString() + c[center].toString()
        }else {
            c[center].toString()
        }
        return answer
    }
}