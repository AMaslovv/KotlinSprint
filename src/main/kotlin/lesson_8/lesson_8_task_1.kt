package lesson_8

/** by AMaslov  */

fun main() {
    //массив с просмотрами
    val adsViewStats: IntArray = intArrayOf(12, 24, 98, 77, 56, 70, 69)

    //суммируем и выводим в консоль
    println("Количество просмотров рекламы за неделю: ${adsViewStats.sum()}")
}