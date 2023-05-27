package lesson_7

/** by AMaslov  */

fun main() {
    println("Введите количество секунд до конца таймера:")
    var timerSec = readln().toInt()

    for (i in timerSec downTo 0){
        println("Времени осталось: $timerSec")
        timerSec--
        Thread.sleep(1000)
    }
    println("Время вышло.")
}