package io.olkkani.start

// java 로 구현된 null check 로직을 kotilin 으로 변환 (원본 java 파일은 강의 참고)
// null 안정성이 java 보다 낫기 때문에 개발 단계에서 npe 이 발생하는 경우를 줄여줄 수 있다
// kotlin 은 npe 이 발생할 확률을 줄여줄 수는 있어도 npe 자체가 없는 것은 아니다
fun getNullStr() : String? = null

fun getLengthIfNotNull (str: String?) = str?.length ?: 0

fun main () {
    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    // npe가 발생할 수 있는 코드 작성
    // 1. 직접 npe 를 발생시킨다
    // throw NullPointerException()

    // 2. 개발자가 단언 연산자를 사용했음에도 null 변수가 들어있는 경우 npe가 발생한다.
    val c : String? = null
    val d = c!!.length

    // 3. Java 코드와 상호 운영하는 경우 발생할 여지가 있다
}