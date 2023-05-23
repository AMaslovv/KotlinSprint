package lesson_5

import java.time.LocalDate

/** by AMaslov  */

const val AGE_OF_MAJORITY = 18

fun main() {
    //инициализация переменных
    val userYearBirth: Int
    val currentYear = LocalDate.now().year

    //присваивание в переменную года рождения
    println("Введите год своего рождения:")
    userYearBirth = readln().toInt()

    //проверка условия
    if ((currentYear - userYearBirth) >= AGE_OF_MAJORITY)
            println("Показать экран со скрытым контентом")
    else println("Доступ запрещен.")
}