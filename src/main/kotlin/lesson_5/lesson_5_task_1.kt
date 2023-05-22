package lesson_5

/** by AMaslov  */

fun main() {
    //инициализация переменных
    val greetings = "Добро пожаловать!"
    val wrongAnswer = "Доступ запрещен."
    val firstSum = 5
    val secondSum = 7

    //вывод в консоль условий авторизации и считывание данных
    println("Для успешной авторизации необходимо решить пример:")
    println("$firstSum + $secondSum = ")
    val userAnswer = readln() ?: ""

    //проверка введеных данных на правильность
    if (userAnswer != ""){
        if (firstSum + secondSum == userAnswer.toInt()) println(greetings)
            else println(wrongAnswer)
    }
    else println("Вы ничего не ввели!")
}