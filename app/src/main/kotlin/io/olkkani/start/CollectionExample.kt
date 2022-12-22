package io.olkkani.start

import java.util.Collections
import java.util.LinkedList
import java.util.stream.Collectors

class CollectionExample {
}

fun listExample () {

    // immutable list
    val currencyList = listOf("달러", "유로", "원")

    // immutable list with collection builder
    // builder 는 내부에서는 mutable 반환은 immutable.. 이후에 값을 수정할 수 없다
    val numberList : List<String> = buildList {
        add("달러")
        add("유로")
        add("원")
    }

    // mutable list
    val mutableCurrencyList = mutableListOf<String>()
    mutableCurrencyList.add("달러")
    mutableCurrencyList.add("유로")
    mutableCurrencyList.add("원")
    // mutable list with collection builder
    val mutableCurrencyList2 = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }
    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    // list forEach
    val iterator = currencyList.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
    for (currency in currencyList) {
        print(currency)
    }
    currencyList.forEach {
        println(it)
    }

}

fun setExample () {
    val numberSet = setOf(1, 2, 3, 4)

    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }
}

fun mapExample(){
    val numberMap = mapOf("one" to 1, "two" to 2)

    val mutableNumberMap = mutableMapOf<String, Int>().apply {
        put("one", 1)
    }
    mutableNumberMap["two"] = 2
    println(mutableNumberMap["one"])
    println(mutableNumberMap["two"])

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
    val upperList = mutableListOf<String>()
    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }
    // console: [A, B, C]
    println(upperList)

    val upperListMap = lowerList.map { it.uppercase() }
    // console: [A, B, C]
    println(upperListMap)


    //
    val filteredList = mutableListOf<String>()
    for (upperCase in upperList) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    // kotlin 에서는 최종 연산자를 사용하지 않아도 된다.
    val filteredList2 = upperList.filter { it == "A" || it == "C" }
    val filteredListByJava = upperList.stream().filter{it == "A" || it == "B"}.collect(Collectors.toList())
    // sequence 는 처리 단계가 적어서 데이터가 많은 경우에 최적화를 위해서 사용
    val filteredListByKotlinLikeJava = upperList.asSequence().filter { it == "A" || it == "C" }.toList()
    println(filteredList2)
    }
}

fun main (){
    val mapExample = mapExample()
}