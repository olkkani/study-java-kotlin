package io.olkkani.string

fun main() {
    
}



fun array (word: String): String {
    val array: List<String> = word.split(" ")
    val reverse = array.reversed()
    return reverse.joinToString(" ")
}