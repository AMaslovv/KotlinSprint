package lesson_4

/** by AMaslov  */

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100
fun main() {
    //инициализация переменных груз 1 и 2
    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    //проверка условия
    val isCargoOneAverage = (weightCargo1 >= MIN_WEIGHT_AVERAGE && weightCargo1 <= MAX_WEIGHT_AVERAGE) && (volumeCargo1 < MAX_VOLUME_AVERAGE)
    val isCargoTwoAverage = (weightCargo2 >= MIN_WEIGHT_AVERAGE && weightCargo2 <= MAX_WEIGHT_AVERAGE) && (volumeCargo2 < MAX_VOLUME_AVERAGE)


//    println("Average для груза с весом $weightCargo1 кг и объемом $volumeCargo1 л: ${(weightCargo1 >= MIN_WEIGHT_AVERAGE && weightCargo1 <= MAX_WEIGHT_AVERAGE) && (volumeCargo1 < MAX_VOLUME_AVERAGE)}")
//    println("Average для груза с весом $weightCargo2 кг и объемом $volumeCargo2 л: ${(weightCargo2 >= MIN_WEIGHT_AVERAGE && weightCargo2 <= MAX_WEIGHT_AVERAGE) && (volumeCargo2 < MAX_VOLUME_AVERAGE)}")

    //printout in console
    println("Average для груза с весом $weightCargo1 кг и объемом $volumeCargo1 л: $isCargoOneAverage")
    println("Average для груза с весом $weightCargo2 кг и объемом $volumeCargo2 л: $isCargoTwoAverage")
}