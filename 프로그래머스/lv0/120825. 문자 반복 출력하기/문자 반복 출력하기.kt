class Solution {
fun solution(my_string: String, n: Int): String {
    var a: StringBuilder = StringBuilder()

    my_string.map {
        for (i in 1..n) {
            a.append(it)
        }
    }
    return a.toString()
}
}