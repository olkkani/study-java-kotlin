import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nums = mutableListOf<Int>()

    for(i in 1 .. 28){
        nums.add(br.readLine().toInt())
    }

    for(i in 1 .. 30){
        if(!nums.contains(i)) {
            println(i)
        }
    }
}

//fun main() {
//    val variable = intArrayOf(1,2,3,4)
//    val variable = 6
//    val var2 = intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)
//    val result = Solution().solution(variable, var2)
//    println(result)
//    result.forEach { println(it) }
//}

