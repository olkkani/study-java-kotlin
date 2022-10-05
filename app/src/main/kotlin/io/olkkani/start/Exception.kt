package io.olkkani.start

fun main () {


    // Checked Exception 이란 시스템에서 포착가능하면 예외 처리를 강제한다
    // Java 와는 다르게 Checked Exception 이 발생하지 않는다
    Thread.sleep(1)

    // try catch 가 필요한 경우에는 선택적으로 사용이 가능하다
    // finally 또한 java 와 동일하게 사용이 가능
    try {
        throw Exception("예외 발생")
    } catch (e: Exception) {
        println("에러가 발생!")
    } finally {
        println("finally 실행")
    }

    // try catch 도 표현식이기 때문에 값을 반환할 수 있다.
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외처리 발생 !")
    }
    println(a)

    // Nothing 은 엘비스 연산자와 병행하면 시너지가 좋다
    val b: String? = null
    val c = b?: failFast("a is null")
    println(c.length)

}

// 함수의 return 이 없는 경우 Unit 을 반환하지만 exception 과 같이 코드가 정상적으로 수행하는 것을 보장하지 않는 경우 Nothing 을 반환한다
// throw 표현식은 nothing 타입이기 때문 Nothing 은 모든 타이브이 서브타입이다
// Unit 은 Return value 가 없을 뿐 return 행위는 한다
// Nothing 은 Return 행위 자체를 하지 않는다
// 비정상 종료, 예외 또는 무한 루프가 동작할 경우 사용한다
fun failFast (message: String): Nothing {
    throw IllegalArgumentException(message)
}