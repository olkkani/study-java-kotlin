package io.olkkani.start.exampleclass

enum class AnswerOption(value: Int) {
    OPTION_A(0),
    OPTION_B(1);
}


fun tetPrint(answerOption: AnswerOption): String{
    return answerOption.name
}

enum class AnswerOptionCodeAndValue(val code: String, val value: Long){
    OPTION_A("A",3),
    OPTION_B("B",4);
}
fun testPrint(answerOptionCodeAndValue: AnswerOptionCodeAndValue){
    println(answerOptionCodeAndValue.code)
    println(answerOptionCodeAndValue.value)
}

fun main() {
  testPrint(AnswerOptionCodeAndValue.OPTION_B)
}