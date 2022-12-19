package io.olkkani.start.enumclass
// enum class 또한 class 이므로 기본 생성자를 선언할 수도 생략할 수도 있습니다.
enum class PaymentStatus (val label: String): Payable{
    UNPAID("미지급") {
        override fun isPayable(): Boolean = true
    },
    PAID("지급 완료") {
        override fun isPayable() = false
    },
    FAILED("지급 실패") {
        override fun isPayable() = false
    },
    REFUNDED("환불") {
        override fun isPayable() = false
    };


//    abstract fun isPayable(): Boolean
//    fun isPayable2() = false
}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
//    if (PaymentStatus.UNPAID.isPayable()){
//        println("결제 가능 상태")
//    }

    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)
    // console: 지급완료

    if (paymentStatus == PaymentStatus.PAID) {
        println("결제 완료 상태")
    }
    // console: 결제 완료 상태

    for (status in PaymentStatus.values()){
        println("[$status](${status.label})")
    }
    // console: [UNPAID](미지급) ...

    for (status in PaymentStatus.values()){
        println("[${status.name}](${status.label}) : ${status.ordinal}")
    }
    // console: [UNPAID](미지급) : 0 ...
    // ordinal 은 0 부터 시작하는 index
}