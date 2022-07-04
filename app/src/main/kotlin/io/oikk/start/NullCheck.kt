package io.oikk.start

// NPE (NullPointerException) 안정성 체크하는 방법

fun main () {
    // val 은 null 을 선언할 수 없다.
    // val a : String = null

    // var 에서는 null 을 재할당할 수 없다.
    // var b : String = "abc"
    // b = null

    // 안전 연산자를 이용하여 npe 컴파일 에러를 방지하고 출력할 수 있다
    var a : String? = null
    println(a?.length)

    // 삼항연산자를 대체하여 처리하는 방법
    var b: Int = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산자 ?: 이 부분이 엘비스 프레슬리의 구렛나루를 닮았다 하여 부르는 이름
    // 좌변이 null인 경우 0 을 할당한다.
    val c = a?.length ?: 0
    println(c)
}