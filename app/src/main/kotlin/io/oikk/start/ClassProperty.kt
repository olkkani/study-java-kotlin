package io.oikk.start

// 본문 내용이 없는 Class 를 선언할 수 있다.
class EmptyClass

// constructor 은 특정한 어노테이션을 병행하는 것이 아니라면 생략하는 것이 가독성에 더 좋다.
//class Coffee constructor(val name: String) {
class Coffee (
    var name: String = "",
    var price: Int = 0, // 후행 쉼표를 넣을 경우 추후에 property 를 추가하는 경우에도 수정이 쉽다, 변경 사항이 아랫 줄부터 추가되기 때문에 코드 리뷰에도 용이
    var iced: Boolean = false,
    ) {

    // custom getter
    val brand: String
        // get () = "스타벅스"
        get () {
            return "스타벅스"
        }

    // Custom Setter
    var quantity : Int = 0
        set(value) {
            if (value > 0 ) {
                field = value // field 는 식별자로 getter 와 setter 에 사용하면 필드에 접근한다는 의미이며 백킹 필드라 말한다
                // quantity 에 직접 할당할 경우 (quantity = value) 재귀 호출을 하여 stackOverflowError 가 발생
            }
        }
}

fun main () {
    // property 가 var 일 경우 getter 와 setter 를 자동으로 생성한다. val 일 경우 getter 만
    val coffee = Coffee ()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

    // Java 에서는 Method 형태의 getter 로 호출하여 값을 가져오지만 코틀린에서는 내부적으로 getter setter 를 만들어서 제공하기 때문에 사용자는 Java 보다 객체지향적으로 사용할 수 있다
    if (coffee.iced){
        println("아이스 커피")
    }

    println("${coffee.name} 가격은 ${coffee.price} 수랼은 ${coffee.quantity}")
}
