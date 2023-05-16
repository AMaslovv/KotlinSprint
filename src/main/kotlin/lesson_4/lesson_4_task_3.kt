package lesson_4

/** by AMaslov  */

const val WEATHER_FOR_BEANS = "солнечная погода"
const val STATUS_TENT = "тент раскрыт"
const val HUMIDITY_PERCENT = "влажность 20"
const val SEASONS = "не зима"

fun main() {
    //инициализация переменных
    val weatherToday = "солнечная погода"
    val statTentToday = "тент раскрыт"
    val humidityToday = "влажность 20"
    val seasonsNow = "зима"

    //проверяем совпадают ли условия и пишем в консоль
    print("Благоприятные ли условия сейчас для роста бобовых? ${(weatherToday == WEATHER_FOR_BEANS) && (statTentToday == STATUS_TENT) && (humidityToday == HUMIDITY_PERCENT) && (seasonsNow == SEASONS)}")
}