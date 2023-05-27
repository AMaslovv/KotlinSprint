package lesson_6

/** by AMaslov  */

fun main() {
    //переменная для количества секунд
    val timerSec: Long

    println("Это приложение-таймер.\n")
    println("Введите количество секунд для отсчета:")

    //считываем количество секунд и переводим в миллисекунды и спим
    timerSec = readln().toLong()
    Thread.sleep(timerSec * 1000)
    println("Прошло $timerSec секунд.")
}