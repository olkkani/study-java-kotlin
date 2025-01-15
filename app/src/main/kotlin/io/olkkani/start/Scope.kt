package io.olkkani.start

import java.time.LocalDate


class Scope {

}


data class Person (
    var name: String,
    var age: Int,
    var country: String,
){
    fun isJapanPrintHello () {
        if(country != "japan" ){
            return
        }
        println("hello")
    }
}


fun main() {
    // apply example
    val applyPerson = Person("Alice", 28, "korea")
    val applyResult = applyPerson.apply {
        name = "james"
        age = 17
    }
    println(applyPerson.toString())
    println(applyResult.toString())

    applyPerson.isJapanPrintHello()
    applyPerson.country = "japan"
    applyPerson.isJapanPrintHello()
    
    val test: MutableMap<LocalDate, Person> = mutableMapOf()

    test[LocalDate.now()]?.apply {
        name = "come"
        country = "usa"
    }
    println(test[LocalDate.now()].toString())
}