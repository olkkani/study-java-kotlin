class Solution {
fun solution(n: Long): IntArray = StringBuilder(n.toString())
    .reverse()
    .toString().chunked(1)
    .map{it.toInt()}.toIntArray()


}