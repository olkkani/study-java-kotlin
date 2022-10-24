class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
                var answer = mutableListOf<Int>()


        for (command in commands) {
            var i = command[0]
            var j = command[1]
            var k = command[2]-1

            var sortedArr = IntArray(j-i+1)
            var tempIndex = 0
            for ( z in i-1 until j) {
                sortedArr[tempIndex] = array[z]
                tempIndex++
            }

            sortedArr.sort()

            answer.add(sortedArr[k])


        }


        return answer.toIntArray()
    }
}