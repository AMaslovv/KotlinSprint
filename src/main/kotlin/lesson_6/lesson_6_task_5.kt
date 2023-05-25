package lesson_6

/** by AMaslov  */

fun main() {
    //инициализация переменных
    val greetings = "Добро пожаловать!"
    val wrongAnswer = "Доступ запрещен."
    var tryCount = 3

    //вывод в консоль условий авторизации и считывание данных
    println("Для успешной авторизации необходимо решить пример:")

    while (tryCount > 0){
        println("У Вас попыток: $tryCount\n")
        val firstSum = (1..9).random()
        val secondSum = (1..9).random()
        println("$firstSum + $secondSum = ")
        val userAnswer = readln().toInt()
        if (userAnswer == (firstSum + secondSum)){
            println(greetings)
            break
        }
     tryCount--
    }
    if (tryCount == 0) println(wrongAnswer)
}