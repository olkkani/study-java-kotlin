class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for (i in left .. right) {
            val divisor = mutableSetOf<Int>()

            divisor.add(1)
            divisor.add(i)

            for (j in 2 .. i) {
                var secondNum = j

                if (j * secondNum > i){
                    break
                }

                while ((j * secondNum <= i) && secondNum <= i ){
                    if (j * secondNum == i){
                    divisor.add(j)
                    divisor.add(secondNum)
                    }
                    secondNum++
                }

            }

            answer += if (divisor.size % 2 == 0) {i} else {-i}
        }
        return answer
    }
}