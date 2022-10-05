package io.olkkani.start

// open class 는 상속이 가능한 상태
open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

// 다음과 같은 문법으로 상속이 가능
open class Bulldog(final override var age: Int = 0) : Dog() {
    // 본문에 구현하거나 기본생성자에 삽입할 수도 있다
   // override var age: Int = 0

    final override fun bark() {
        println("컹컹")
        }
}

//fun main () {
//    val dog = Bulldog(age = 2)
//    println(dog.age)
//    dog.bark()
//}

// override 된 경우 자동으로 open 상태가 된다
// 만약 상위 클래스에 final 로 선언된 경우에는 상속할 수 없다
//class ChildBulldog : Bulldog () {
//
//    override var age: Int = 0
//
//    override fun bark() {
//        super.bark()
//    }
//}


// 추상 클래스
abstract class Developer {
    abstract var age: Int
    abstract fun code (language: String)
}
class BackendDeveloper(override var age: Int): Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main () {
    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    println(backendDeveloper.code("kotlin"))
}