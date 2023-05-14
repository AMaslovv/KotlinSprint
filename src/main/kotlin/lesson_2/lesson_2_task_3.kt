package lesson_2

/** by AMaslov  */
fun main() {
    // объявление переменных и их инициализация
    val timeTravel = 457
    val hourTrainStart = 9
    val minutesTrainStart = 39

    //Общее количество минут
    val overallMinutes = timeTravel + minutesTrainStart

    //вычисление остатка минут, перевод минут в часы и суммирование с временем отправки
    val trainMinutArriv = overallMinutes % 60
    val trainHourArriv = (overallMinutes / 60) + hourTrainStart
    println("Время прибытия поезда: $trainHourArriv:$trainMinutArriv")
}