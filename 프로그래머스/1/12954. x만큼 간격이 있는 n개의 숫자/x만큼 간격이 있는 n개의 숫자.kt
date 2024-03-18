class Solution {
 fun solution(x: Int, n: Int): LongArray {
        val numbers = mutableListOf<Long>()
        for(i in 1 .. n){
            numbers.add(x.toLong()*i.toLong())
        }
        return numbers.toLongArray()
    }
}