package io.oikk.start


fun main () {
// When 은 Switch 와 비슷
    val day = 2
    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        // else 는 생략이 가능
        else -> "기타"
    }
    println(result)

    // Enum 에서 값을 추론하기 때문에 else 를 생략할 수 있다.
    when (getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
    }

    //
    when (getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> print("0 또는 1이 아님")
    }

}



enum class Color {
    RED, GREEN
}

fun getColor () = Color.RED
fun getNumber () = 2