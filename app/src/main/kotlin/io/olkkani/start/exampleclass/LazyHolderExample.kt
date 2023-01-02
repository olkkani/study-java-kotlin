package io.olkkani.start.exampleclass

class HelloBot {
    // var 을 사용하는 경우에는 불변성을 유지할 수 없어 사용하지 않는 것이 좋습니다
//    var greeting: String? = null
    // lazy 환경에서 안전하다는 것이 가장 큰 장점
    private val greeting: String by lazy { // lazy(LazyThreadSafetyMode.SYNCHRONIZED) 와 동일
    // 멀티스레드 환경에서는 오버헤드가 발생할 수도 있기 때문에
        println("초기화 로직 수행")    // 여러번 호출하더라도 해당 출력은 단 한번만
        getHello() }

    fun sayHello() = println(greeting)

}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

//    helloBot.greeting = getHello()
    helloBot.sayHello()
    helloBot.sayHello()
    helloBot.sayHello()

    for (i in 1 .. 5){
        Thread {
            helloBot.sayHello()
        }.start()
    }
}