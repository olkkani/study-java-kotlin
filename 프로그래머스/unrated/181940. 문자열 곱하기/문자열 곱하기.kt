class Solution {
    fun solution(my_string: String, k: Int): String {
        var string = ""
        for (i in 1 .. k ) {
            string += my_string
        }
        return string
    }
}