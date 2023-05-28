package lesson_8

/** by AMaslov  */

fun main() {
    //объявление переменной для ингредиентов
    val ingredientsArray = arrayOf<String>()

    print("Введите количество ингредиентов, которые хотите добавить: ")
    val ingredientsCount = readln().toInt()

    // заполняем массив
    for (i in 0 until ingredientsCount) {
        print("Введите ингредиент номер ${i + 1} : ")
        val userIngredient = readln()
        ingredientsArray.plus(userIngredient)
    }
}