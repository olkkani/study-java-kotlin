package io.olkkani.start.exampleclass


// var 과 같은 가변 property 를 지연 초기화 할 수 있는 기능
class LateInitExample {
    lateinit var text: String
    val textInitialized : Boolean
        get() = this::text.isInitialized

    fun printText() {
        if (this::text.isInitialized){
            println("초기화됨")
        } else {
            text = "안녕하세요"
        }
        text = "안녕하세요"
        println(text)
    }
}

fun main() {
    val text = LateInitExample()

    if (!text.textInitialized){
        text.text = "하이요"
    }
    text.printText()
}