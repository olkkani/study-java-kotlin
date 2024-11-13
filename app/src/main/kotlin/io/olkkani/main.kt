package io.olkkani
fun calculateIQR(data: List<Double>): Pair<Double, Double> {
    val sortedData = data.sorted()
    val q1 = sortedData[(sortedData.size * 0.25).toInt()]
    val q3 = sortedData[(sortedData.size * 0.75).toInt()]
    return Pair(q1, q3)
}

fun detectOutliersUsingIQR(data: List<Double>): List<Double> {
    val (q1, q3) = calculateIQR(data)
    val iqr = q3 - q1
    val lowerBound = q1 - 1.5 * iqr
    val upperBound = q3 + 1.5 * iqr
    return data.filter { it in lowerBound..upperBound }
}

fun calculateStatistics(data: List<Double>): Triple<Double, Double, Double> {
    val filteredData = detectOutliersUsingIQR(data)
    val min = filteredData.minOrNull() ?: Double.NaN
    val max = filteredData.maxOrNull() ?: Double.NaN
    val average = if (filteredData.isNotEmpty()) filteredData.average() else Double.NaN
    return Triple(min, max, average)
}

fun main() {
    val data = listOf(10.0, 12.0, 14.0, 15.0, 16.0, 18.0, 19.0, 21.0, 50.0, 100.0)
    val (min, max, average) = calculateStatistics(data)
    println("Filtered Data Statistics:")
    println("Min: $min, Max: $max, Average: $average")
}