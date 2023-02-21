class Solution {
    fun solution(angle: Int): Int = when{
        (angle in 1..89) -> 1
        (angle == 90) -> 2
        (angle == 180) -> 4
        else -> 3
    }
}