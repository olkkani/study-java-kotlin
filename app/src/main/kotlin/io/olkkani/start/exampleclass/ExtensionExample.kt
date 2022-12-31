package io.olkkani.start.exampleclass

// 확장 함수를 사용하는 경우 다음과 같이 선언한다
// 확장 함수는 static final method 로 컴파일된다
fun String.first() : Char {
    return this[0] // this 는 리시버 혹은 수신자 객체라 부른다
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

// 다음과 같이 동일한 시그니쳐로 확장 함수를 선언하는 경우에는 클래스가 보유하고 있는 메소드가 우선순위를 갖는다
fun MyExample.printMessage() = println("확장 출력")
// 다음과 같이 시그니처가 같더라도 인자가 다르면 사용할 수 있다
fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull(){
    if (this == null) println("Null 인 경우에만 출력")
    else println("null 이 아닌 경우에만 출력")
}

fun main() {
    println("ABCD".first())
    // console: A
    println("ABCD".addFirst('Z'))
    // console: ZABCD
    MyExample().printMessage()
    // console: 클래스 출력]
    MyExample().printMessage("확장 출력")
    // 확장 출력
    var myExample: MyExample? = null
    myExample.printNullOrNotNull() // 안전 연산자를 사용하지 않았음에도 컴파일 오류가 발생하지 않은 이유는 내부에서 Null 에 대한 처리한다는 것을 알고 있기 때문이다
    // 널인 경우에만 출력
    myExample = MyExample()
    myExample.printNullOrNotNull()
    // 널이 아닌 경우에만 출력
}

