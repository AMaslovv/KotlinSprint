package lesson_4

/** by AMaslov  */

fun main() {
    //инициализация переменных
    val firstDay = 1
    val currentDay = 5

    //четные дни или нет
    val isFirstDayParity = firstDay % 2 == currentDay % 2
    val isArmTrain = isFirstDayParity
    val isAbsTrain = isFirstDayParity
    val isLegsTrain = !isFirstDayParity
    val isBackTrain = !isFirstDayParity

    //выводим результат
    print("""
        Упражнения для рук:       $isArmTrain
        Упражнения для ног:       $isLegsTrain
        Упражнения для спины:     $isBackTrain
        Упражнения для пресса:    $isAbsTrain
        
    """.trimIndent()
    )
}