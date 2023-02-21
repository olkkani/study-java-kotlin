class Solution {
    fun solution(rsp: String): String {
        var answer: StringBuilder = StringBuilder()
        rsp.split("").forEach{
            i -> when (i) {
                "0" -> answer.append("5")
                "2" -> answer.append("0")
                "5" -> answer.append("2")
                else -> answer.append("")
            }
        }
        return answer.toString()
    }
}