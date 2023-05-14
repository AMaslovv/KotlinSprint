package lesson_2

import kotlin.math.pow

/** by AMaslov  */

fun main() {
    //инициализируем переменные
    val clientSumInit = 70_000
    val rateInYear = 16.7
    val periodInYears = 20

    //калькуляция сложного процента и вывод в консоль
    val clientSumRated = clientSumInit * (1 + rateInYear / 100).pow(periodInYears)
    println("%.3f".format(clientSumRated))
}