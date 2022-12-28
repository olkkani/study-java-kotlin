package io.olkkani.start.other

import java.time.LocalDateTime

object Singleton {

    val a = 1234

    fun printA() = print(a)
}

object DatetimeUtils {
    val now : LocalDateTime
        get() = LocalDateTime.now()
    // const val 은 컴파일 val 은 런타임
    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }
}
// 동반 객체
class MyClass {
    private constructor()
    companion object {
        val a = 1234

        fun newInstance() = MyClass()
    }
}

fun main () {
    // singleton example - 1
    println(Singleton.a)
    Singleton.printA()


    println(DatetimeUtils.now)
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)

    println(DatetimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    println(DatetimeUtils.same(now, now))

    //
    println(MyClass.a)
    println(MyClass.Companion.a) // 특별한 이유가 업다면 companion 은 생략이 가능
    println(MyClass.newInstance())
    println(MyClass.Companion.newInstance())

}