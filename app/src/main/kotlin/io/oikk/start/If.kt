package io.oikk.start

// if 포현식은 java 의 if 와 다르게 return 이 가능하다
const val age : Int = 10
val str = if (age > 10) {
    "성인"
} else {
    "아이"
}

// 코틀린은 if 문 자체가 표현시이므로 삼항 연산자가 필요 없다.
val a = 1
val b = 2
val c = if (a > b) b else a
