class Solution {
fun solution(n: Int): Int  {
    var num = 0
    for (i in 0 .. n step 2){
        num+=i
    }
    return num
}
}