package io.olkkani.start.`class`

// Class 를 생성하기 위해서는 data 라는 prefix 를 삽입한다
// toString hashCode equals 를 생성
data class Person (
    // val 을 사용하면 불변성을 유지할 수 있다. 불변성을 유지하면 동기화 처리를 줄여주고 안정성을 유지할 수 있다
    val name: String,
    val age: Int,
)

fun main() {
    val person1 = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)
    //equals
    println(person1 == person2)
    //hashSet
    val set = hashSetOf(person1)
    set.contains(person2)
    println(set.contains(person2))
    // toString
    println(person1.toString())
    // copy,
    val person3 = person1.copy() // 값을 수정하고 싶은 경우 person1.copy(name="strange") 처럼 할 수 있다
    println("이름=${person1.component1()}, 나이=${person2.component2()}")
    println("이름=${person1.name}, 나이=${person2.age}")
    val (name, age) = person1
    print("이름=${name}, 나이=${age}")

}
