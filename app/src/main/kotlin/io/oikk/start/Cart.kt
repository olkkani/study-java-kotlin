package io.oikk.start

class Product (val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel {
    // inferfaece 에서는 propertey 도 구현이 가능
    var coin: Int

    // interface 에서는 백킹 필드가 불가능 하기 때문에 특정 상수값을 반환하는 방법을 사용
    // 백킹 필드가 불가능하기 때문에 setter도 불가능하고 var 변수도 사용할 수 없다
    val weight : String
        get() = "20KG"

    fun add (project: Product)
    fun rent () {
        if (coin < 0) {
            println("카트를 대여합니다.")
        }
    }

    override fun roll() {
        println("카드가 굴러갑니다.")
    }
    fun printId() = println("1234")
}
// 복수개의 인터페이스를 상속하기 위한 Order 인터페이스 상속
interface Order {
    fun add (product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }
    fun printId() = println("1234")
}
// 복수개의 인터페이스를 상속하는 방법 ,로 구분하여 상속
// 복수개의 인터페이스
class MyCart(override var coin: Int) : Cart, Order {
    // rent 는 Cart Interface 에서 구현하므로 MyCart Class 에서 override 하지 않았음
    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name} 이(가) 카트에 추가돼었습니다.")

        // 여러개의 인터페이스에서 동일한 시그니쳐를 가진 함수를 실행하는 경우 내가 원하는 디폴트 함수를 실행하는 방법
        super<Order>.add(product)
    }

    // 동일한 시그니처를 가진 디폴트 함수가 두개 이상일 경우 override 가 강제된다
    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }
}


fun main () {
    var cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감", price = 1000))
    cart.printId()
}