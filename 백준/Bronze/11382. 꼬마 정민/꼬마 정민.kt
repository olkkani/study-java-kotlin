import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    var result: Long = 0
    while (st.hasMoreTokens()){
        result += st.nextToken().toLong()
    }


    println(result)
}