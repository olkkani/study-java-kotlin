import kotlin.math.pow

class Solution {
fun solution(n: Long): Long {
    val numbers = n.toString().chunked(1).map { it.toLong() }.toLongArray()
    numbers.sort()

    var number: Long = 0
    for(i in numbers.indices){
        number += numbers[i] * 10.0.pow(i.toDouble()).toLong()
    }
    return number
}
}