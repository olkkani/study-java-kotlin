package io.olkkani.start
// 코틀린은 자바와 다르게 클래스 밖, 탑 레벨에 코딩이 가능하다.
var x = 5

// 1장. 변수 생성하기
fun main () {
    // class 밖에 선언된 변수도 자유롭게 호출이 가능
    println(x)

    // keyword 변수명 : Type = 초기값 으로 구성
    val a : Int = 1
    // 컴파일 단계에서 변수에 대입될 값을 자동으로 추론해주기 때문에 생략이 가능
    val b = 1
    // 지연 할당. 변수와 타입을 선언하고 나중에 값을 할당해도 된다
    val c : Int
    c = 1
    // 지연 할당을 하는 경우에는 최초에 타입을 꼭 선언해줘야 한다
    // val d
    // d = 123

    // val (value) : 재할당이 불가능한 상수
    // val(variable) : 재할당이 가능한 변수

    val e : String = "Hello"
    // e = "world"  다음과 같이 val을 쓰는 경우 재할당 할 수  없음

    var f = 123
    // f = "hi" 최초 선언된 타입과 다른 타입을 재할당할 경우에는 컴파일 오류가 발생함

}