package io.olkkani.start.exampleclass

class PairDestructuring {
}

data class Tuple (val a: Int, val b: Int)

//fun plus(tuple: Tuple) = tuple.a + tuple.b
fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main(){
//    val plus = plus(Tuple(1, 3))
    val plus = plus(Pair(1, 3))
    println(plus)

    val pair = Pair("A", 1) // pair 의 first 와 second 는 불변
    val newPair = pair.copy(first = "B") // copy 를 사용하여 값을 변결할 수도 있다.
    println(newPair)

    val second = newPair.component2()
    println(second)

    val toList = newPair.toList() // immutable list
    println(toList)
    // 네 개 이상은 제공하지 않음
    val triple = Triple("A","B","C")
    println(triple)
    triple.first
    triple.second
    triple.third

    // 구조 분해 할당 문법
    val (a, b: String, c) =  triple // 타입 선언이 가능하다
    println("$a, $b, $c")

    val toList1 = triple.toList()
    val (a1, a2, a3) = toList1
    println("$a1, $a2, $a3")
    // component 는 6 이상을 제공하지 않는다.
    toList1.component1()
    toList1.component2()
    toList1.component3()
    toList1.component4()
    toList1.component5()

    val map = mutableMapOf("안찬진" to "개발자") //  OR ("안찬진", "개발자")
    for ((key, value) in map){
        println("${key} 는 $value")
    }
}