package lesson_4

/** by AMaslov  */

const val WEATHER_FOR_BEANS = "солнечно"
const val IS_TENT_OPEN = true
const val HUMIDITY_FOR_BEANS = 20
const val SEASON_FOR_BEANS = "зима"

fun main() {
    //инициализация переменных
    val weatherToday = "солнечно"
    val isTentOpen = true
    val humidityToday = 20
    val seasonNow = "зима"

    //проверяем совпадают ли условия и пишем в консоль
    print("Благоприятные ли условия сейчас для роста бобовых? ${(weatherToday == WEATHER_FOR_BEANS) && 
                                                                (isTentOpen == IS_TENT_OPEN) && 
                                                                (humidityToday == HUMIDITY_FOR_BEANS) && 
                                                                (seasonNow != SEASON_FOR_BEANS)}")
}