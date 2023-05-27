package lesson_6

/** by AMaslov  */

fun main() {
    //инициализация переменных
    var tryCount = 5
    val hiddenNumber = (1..9).random()

    println("Здравствуйте!\nВас приветствует игра Угадайка!")
    println("У Вас $tryCount попыток чтобы отгадать загаданное число от 1 до 9:")

    //считываем ответ и проверяем в цикле
    do {
        val answerUser = readln().toInt()
        if (hiddenNumber == answerUser) {
            println("Это была великолепная игра!")
            break
        } else {
            tryCount--
            println("Неверно! Осталось попыток: $tryCount")
        }
    } while (tryCount > 0)
    if (tryCount == 0) println("Было загадано число: $hiddenNumber")
}