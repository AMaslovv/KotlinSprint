package lesson_1

/** by AMaslov  */

fun main() {
    var numberOrders: Int = 75
    val notifThanks: String = "Благодарим Вас за покупку!"

    //Вывод ранее объявленных переменных в консоль
    println("Заказ - $numberOrders")
    println(notifThanks)

    //добавление переменной для количества работников и вывод в консоль
    var workersCountNow = 2000
//    println("Количество работников: $workersCountNow")

    //минус один работник
    workersCountNow = 1999
    println("Количество работников: $workersCountNow")
}