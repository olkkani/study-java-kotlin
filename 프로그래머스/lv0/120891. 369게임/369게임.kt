class Solution {
fun solution(order: Int): Int = order.toString().toCharArray().count { it ->
    it == '3' || it == '6' || it == '9'
}
}