package lesson_6

/** by AMaslov  */

fun main() {
    //инициализация переменных
    var tryCount = 5
    val hiddenNumber = (1..9).random()

    println("Здравствуйте! Вас приветствует игра Угадайка!")
    println("У Вас $tryCount попыток чтобы отгадать загаданное число от 1 до 9:\n")

    //считываем ответ и проверяем в цикле
    do {
        val answerUser = readln().toInt()
        if (hiddenNumber == answerUser){
            println("Это была великолепная игра!")
            break
        }
        else {
            tryCount--
            println("Неверно! Остолось попыток: $tryCount")
        }
    }while (tryCount > 0)
    println("Было загадано число: $hiddenNumber")
}