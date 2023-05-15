package lesson_3

/** by AMaslov  */

fun main() {
    //инициализация переменных
    val nameUser = "Андрей"
    var greetings: String

    //выводим в консоль приветствие и имя юзера 2 раза для дня и вечера
    greetings = "Добрый день"
    println("$greetings,$nameUser!")

    greetings = "Добрый вечер"
    println("$greetings,$nameUser!")
}