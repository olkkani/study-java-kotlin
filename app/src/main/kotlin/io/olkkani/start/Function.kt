package io.olkkani.start
// 기본적인 함수 선언 스타일
// 예약어fun 메소드명 (변수명: 타입, 변수명: 타입) : 반환타입 { body }
fun sum (a: Int, b: Int) : Int{
    return a + b
    // Body 가 있는 함수는 반환타입을 제거하면 컴파일 오류가 발생
}

// body가 없는 표현식 스타일
fun sum2 (a: Int, b: Int) : Int = a + b

// 표헌식 & 반환타입 생략
fun sum4(a: Int, b: Int)  = a + b

// 반환 타입이 없는 함수는 Unit 을 반환. java void 와 비슷
fun printSum(a: Int, b: Int ) : Unit {
    println("$a + $b = ${a + b}")
}

// 디폴트 파라미터
fun greeting (message: String = "안녕하세요"){
    print(message)
}

// greting method 에 파라미터가 없는 경우 디폴트 파라미터가 출력되고 파라미터 있는 경우 해당 파라미터를 사용
//fun main () {
//    greeting()
//    greeting("Hi")
//}

// named argument
fun log (level: String = "INFO", message: String ) {
    println("[$level] $message")
}

fun main(){
    log(message = "인포 로그")
    log(level = "DEBUG", message = "디버그 로그")
    log("warn", "경고 로그")
}