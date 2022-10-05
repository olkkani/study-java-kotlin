package io.olkkani

class test {

    fun solution(n: Int): Int {
        var answer = 0;
        for (i in 1 .. n){
            if (n % i == 0){
                answer += i;
            }
        }
        return answer
    }


}

fun main() {
    val test = test()
    println(test.solution(0))
    println(test.solution(1))
    println(test.solution(2))
    println(test.solution(12))
    println(test.solution(16))
}