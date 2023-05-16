package lesson_2

/** by AMaslov  */

fun main() {
    //объявление переменных и инициализация
    val crystallOre: Byte = 7
    val ironOre: Byte = 11
    val buffPercent: Byte = 20

    //вычсление бонусной руды с баффом 20пр и выведение в консоль
    println("Бонус кристаллической руды с баффом: " + (crystallOre * buffPercent) / 100)
    println("Бонус железной руды с баффом: " + (ironOre * buffPercent) / 100)
}