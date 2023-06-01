package lesson_9

/** by AMaslov  */

fun main() {
    //инициализация переменых
    val omletIngredList = mutableListOf(2, 50, 15)

    //узнаем количество порций и пересчитываем
    print("Сколько порций омлета Вы будете готовить? ")
    val portionCount = readln().toInt()
    val omletOnePortion = omletIngredList.map {

        (it * portionCount)
    }
    println("На количество \"$portionCount\" порций Вам понадобится: Яиц - ${omletOnePortion[0]}шт, Молока - ${omletOnePortion[1]}мл, Сливочного масла - ${omletOnePortion[2]}гр.")
}