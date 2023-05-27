package lesson_7

/** by AMaslov  */

fun main() {
   do {
       val authCode = (1000..9999).random()
       println("Ваш код авторизации: $authCode\n")
       println("Введите код:")
       val userAnswer = readln().toInt()
      } while (authCode != userAnswer)
    println("Добро пожаловать!")
}