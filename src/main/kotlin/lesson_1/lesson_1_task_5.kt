package lesson_1

/** by AMaslov  */

fun main() {
    //Объявление переменных и перевод секунд в минуты
    val seconds = 6480
    val minutes = 6480 / 60

    //вывод в консоль минут и секунд с дополнением ведущим нулем
    println("$minutes:" + (seconds % 60).toString().padStart(2,'0'))
}