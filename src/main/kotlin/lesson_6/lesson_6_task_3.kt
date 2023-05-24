package lesson_6

/** by AMaslov  */

fun main() {
    //переменная для количества секунд
    var timerSec = 0

    println("Это приложение-таймер.\n")
    println("Введите количество секунд для отсчета:")
    timerSec = readln().toInt()

    //цикл
    while (timerSec > 0) {
        Thread.sleep(1_000)
        println("Осталось секунд: ${timerSec--}")
    }
    println("Время вышло!")
}