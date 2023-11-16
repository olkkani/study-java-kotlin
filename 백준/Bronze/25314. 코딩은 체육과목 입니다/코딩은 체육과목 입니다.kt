import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    var result: String = ""
    for(i in 1 .. num/4){
        result += "long "
    }
    println(result+"int")
}