class Solution {
    fun solution(num: Int): Int {
        var number: Long = num.toLong()
        var answer = 0


        if (number == 1.toLong()){return 0}

        while (number > 1 && answer <= 500) {
            number = if (number % 2 == 0.toLong()){ number / 2 } else {(number * 3) + 1}
            answer++
        }

        return if(answer >= 500){-1}else {answer}
    }
}