package io.olkkani.start

class LamdaFunctionProgramming {
}


// 1 급 개체
// 함수도 타입이다.
    val printHello: ()-> Unit = { println("Hello")}
    val func2:() -> String = {""}
// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

// 함수형 프로그래밍에 1급 객체의 특성을 적용하기 위해서는 다음과 같이 fun 으로 선언해서는 안된다.
fun printNO () = println("No!")

// String: 매개변수의 타입, Unit: {}의 타입, Message: String, 변수명과 변수타입
val printMessage: (String) -> Unit = {message: String -> println(message)}
val printMessageShotCode1: (String) -> Unit = {message -> println(message)}
val printMessageShotCode2: (String) -> Unit = { println(it)}
// 3. plus 함수 선언
val plus : (Int, Int, Int) -> Int = {a, b, c -> a + b + c}
// 4.

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}
// 5.
val list2 = listOf("a","b","c")
val printStr: (String) -> Unit = {println(it)}
// 6.
val upperCase: (String) -> String = { it.uppercase()}


fun outerFunc(): () -> Unit {
    return fun() {
        println("이것은 익명함수!")
    }
}
// fun outerFunc(): () -> Unit { println("이것은 익명 함수!")} 로 생략이 가능
// 8. 람다식
val sum1:(Int, Int) -> Int = {x: Int, y: Int -> x + y}
val sum2 = {x: Int, y: Int -> x + y}
// 10
fun arg1(block: (String) -> Unit){}
fun arg2(block: (String, String) -> Unit){}
fun main() {

    // 함수는 값이 될 수 있고, 값이 함수가 될 수 있다.
    //  val func:() -> String = {}
    val list = mutableListOf(printHello)
    list[0]()
    val func = list[0]
    func()
    call(printHello)

    // 3. plus 함수 예제
    val result: Int = plus(1, 3, 5)
    println(result)

    //5
    forEachStr(list2, printStr)
    //6
    println(list2.map(upperCase))
    //7
    // outerFunc() 로 실행할 경우 익명함수가 출력되지 않는다.
    outerFunc()()
    val outerFunc2 = outerFunc()
    outerFunc2
    // 9. 후행 람다 전달, 함수의 마지막 인자가 함수인 경우에 사용이 가능
    // 인자가 하나인 경우에는 it을 사용할 수 있다.
    forEachStr(list2){
        println(it.length)
    }
    list2.forEach{
        println(it)
    }
    list2.filter {
        it == "a"
    }
    // 10.
    arg1{
        it.length
        it.first()
    }
    arg2{a: String, b:String ->
        a.length
        b.first()
    }
    // 11. 람다 레퍼런스
    // val callReference : () -> Unit = {printHello()}
//    callReference()
    val callReference = ::printHello
    callReference()()
    val numberList = listOf("1","2","3")
    numberList.map(String::toInt).forEach(::println)
}