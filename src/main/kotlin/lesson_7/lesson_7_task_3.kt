package lesson_7

/** by AMaslov  */

fun main() {
    //вывод в консоль четных чисел до указанного пользователем
    println("Введите ваше число:")
    val userNum = readln().toInt()

    for (i in 0..userNum step 2) print("$i ")
}