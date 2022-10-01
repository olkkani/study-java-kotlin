package io.oikk.start

fun main () {
    // 범위 연산자 '..' 를 사용하여 for loop 를 돌릴 수 있다. 뒷 숫자까지 loop 가 돈다.
    for (i in 0 .. 3){
        println(i)
        // 0 1 2 3
    }

    // untill 을 사용하여 반복한다. 뒷 숫자 전까지 loop 가 돈다
    for (i in 0 until 3){
        println(i)  // 0 1 2
    }

    // 0 부터 2씩 증가 하는 stop 옵션
    for (i in 0..6 step 2){
        println(i) // 0 2 4 6
    }

    // downTo 를 사용하여 값을 감소시킨다.
    for (i in 3 downTo 1){
        println(i) // 3 2 1
    }

    // 전달 받은 배열을 반복
    val numbers = arrayOf(1,2,3)
    for (i in numbers){
        println(i) // 1 2 3
    }

}