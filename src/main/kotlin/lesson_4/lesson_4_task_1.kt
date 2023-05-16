package lesson_4

/** by AMaslov  */

const val ALL_PLACE_REST = 13

fun main() {
    //объявление и инициализация переменных
    val todayTableBusy = 13
    val tomorrowTableFree = 4
    val tomorrowTableBusy = ALL_PLACE_REST - tomorrowTableFree
    // сравнение и вывод в консоль
    println("Доступность столиков на сегодня: ${todayTableBusy < ALL_PLACE_REST}\nДоступность столиков на завтра: ${tomorrowTableBusy < ALL_PLACE_REST}")
}