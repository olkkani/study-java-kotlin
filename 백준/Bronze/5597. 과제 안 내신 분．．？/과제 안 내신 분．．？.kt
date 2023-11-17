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