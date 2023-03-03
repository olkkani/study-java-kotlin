class Solution {
    fun solution(my_string: String): String = my_string.filterNot{"aieou".contains(it)}
}