package lesson_4

/** by AMaslov  */

const val IS_SHIP_DAMAGED = false
const val IS_WEATHER_GOOD = true
const val PROVISION_QUANTITY = 50 // >50
const val MIN_CREW_COUNT = 55
const val RECOMEND_CREW_COUNT = 70 // <70

fun main() {
    //инициализация переменных и ввод данных с консоли
    println("Имеются ли повреждения корпуса?")
    val isShipDamaged = readln()!!.toBoolean()
    println("Благоприятная погода?")
    val isWeatherGood = readln()!!.toBoolean()
    println("Введите количество ящиков провизии:")
    val provisionQuantity = readln()!!.toInt()
    println("Укажите численность экипажа:")
    val crewCount = readln()!!.toInt()

    //проверка условий и вывод
    print("Может ли корабль отправляться в плавание? ${((provisionQuantity > PROVISION_QUANTITY) && (isShipDamaged == IS_SHIP_DAMAGED) && 
            ((isWeatherGood == IS_WEATHER_GOOD) or (isWeatherGood != IS_WEATHER_GOOD)) && ((crewCount >= MIN_CREW_COUNT) and (crewCount < RECOMEND_CREW_COUNT)) ||
            (provisionQuantity > PROVISION_QUANTITY) && (isShipDamaged != IS_SHIP_DAMAGED) && (isWeatherGood == IS_WEATHER_GOOD) && (crewCount == RECOMEND_CREW_COUNT))
    }")
}