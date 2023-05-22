package lesson_5

/** by AMaslov  */

fun main() {
    //переменная с выигрышными номерами
    val winningNumbers = intArrayOf(12,87)

    //озвучиваем условия и считываем числа
    println("Здравствуйте!")
    println("Для того чтобы выиграть Вам необходимо угадать два числа от 1 до 100!")
    println("Введите первое число: ")
    val firstUserAnswer = readln().toInt()
    println("Введите второе число: ")
    val secondUserAnswer = readln().toInt()

    //проверяем
    if ((firstUserAnswer in winningNumbers) and (secondUserAnswer in winningNumbers))
            println("Вы выиграли главный приз!")
    else if ((firstUserAnswer in winningNumbers) or (secondUserAnswer in winningNumbers))
        println("Вы угадали одно число и выиграли утешительный приз!")
    else
        println("Неудача! Крутите барабан!")
    println("Загаданы числа были: ${winningNumbers.contentToString()}")
}