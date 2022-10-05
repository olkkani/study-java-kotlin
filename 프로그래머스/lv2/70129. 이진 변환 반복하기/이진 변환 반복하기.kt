class Solution {
   var replaceZeroCount: Int = 0
    var loopCount: Int = 0

    fun solution(s: String): IntArray {

        var ss: String = s

        while ("1" != ss){
            ss = replaceZero(ss)
            ss = convert(ss.length)
            loopCount++
        }

        return intArrayOf(loopCount, replaceZeroCount)
    }

    fun replaceZero (s: String): String {
        var ss: String = s
        while (ss.contains("0")){
            ss = ss.replaceFirst("0", "")
            replaceZeroCount++
        }
        return ss
    }

    fun convert (i: Int): String {
        var ii: Int = i;
        var result = ""
        while (ii != 0){
            result = (ii%2).toString() + result
            ii /= 2
        }
        return result
    }
}