package io.olkkani.start


class Scope {

}


data class Person (
    var name: String,
    var age: Int,
    var country: String,
)


fun main() {
    // apply example
    val applyPerson = Person("Alice", 28, "korea")
    val applyResult = applyPerson.apply {
        name = "james"
        age = 17
    }
    println(applyPerson.toString())
    println(applyResult.toString())
}