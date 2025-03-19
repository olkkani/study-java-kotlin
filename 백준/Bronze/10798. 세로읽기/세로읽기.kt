import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(15) { "" }

    for (i in 1..5){
        val lines = br.readLine().toCharArray()
        lines.mapIndexed { index, value ->
            arr[index] += value.toString()
        }
    }
    var result = ""
    arr.map{ result+= it }

    bw.write(result)
    bw.flush()
    bw.close()
}